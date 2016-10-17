import json
import requests
import warnings

class Dota2API(object):
    def __init__(self,key):
        self.preamble = "http://api.steampowered.com/"
        self.session = requests.Session()
        self.Key = key

    #Make a specific request to Steam Server
    def _make_request(self,sub_url,payload=None,method="GET"):
        response = None
        url = self.preamble + sub_url
        if method == "POST":
            response = self.session.post(url,data=payload,verify=True)
        else:
            response = self.session.get(url,params=payload,verify=True)
        
        if response.status_code in [200,400]:
            data = json.loads(response.text)
            if data["valid_response"]:
                if data.get("warning"):
                    warnings.warn(data["warning"])
                return data["response"]
    
    #Get New For Steam
    def getNewsForApp(self,appid,count=3,maxlength=300,fileformat="json"):
        return self._make_request("ISteamNews/GetNewsForApp/v0002/?appid=%s&count=%s&maxlength=%s&format=%s"%(appid,count,maxlength,fileformat))
    
    #Get Global Achievement Percentages
    def getGlobalAchievementPercentagesForApp(self,gameid,fileformat="json"):
        return self._make_request("ISteamUserStats/GetGlobalAchievementPercentagesForApp/v0002/?gameid={gameid}&format={fileformat}".format(gameid=gameid,fileformat=fileformat))
    
    #Get Global Stats For Game
    def getGlobalStatsForGame(self,gameid,count=1,name0="global.map.emp_isle",fileformat="json"):
        return self._make_request("ISteamUserStats/GetGlobalStatsForGame/v0001/?format={fileformat}&appid={gameid}&count={count}&name[0]={name0}".format(fileformat=fileformat,appid=gameid,count=count,name0=name0))
    
    #Get Player Summaries
    def getPlayerSummaries(self,steamid):
        return self._make_request("ISteamUser/GetPlayerSummaries/v0002/?key={key}&steamids={steamid}".format(key=self.Key,steamids=steamid))

    #Get Friend List
    def getFriendList(self,steamid):
        return self._make_request("ISteamUser/GetFriendList/v0001/?key={key}&steamid={steamid}&relationship=friend".format(key=self.Key,steamid=steamid))

    #Get Player Achievements
    def getPlayerAchievements(self,steamid,appid):
        return self._make_request("ISteamUserStats/GetPlayerAchievements/v0001/?key={key}&appid={appid}&steamid={steamid}".format(key=self.Key,appid=appid,steamid=steamid))
    
    #Get User Stats For Game
    def getUserStatsForGame(self,steamid,appid,fileformat='json'):
        return self._make_request("ISteamUserStats/GetUserStatsForGame/v0002/?key={key}&appid={appid}&steamid={steamid}&format={fileformat}".format(key=self.Key,appid=appid,steamid=steamid,fileformat=fileformat))
    
    #Get Owned Games
    def getOwnedGames(self,steamid):
        return self._make_request("IPlayerService/GetOwnedGames/v0001/?key={key}&steamid={steamid}".format(key=self.Key,steamid=steamid))
    
    #Get Recently Played Games
    def getRecentlyPlayedGames(self,steamid,count=1,fileformat='json'):
        return self._make_request("IPlayerService/GetRecentlyPlayedGames/v0001/?key={key}&steamid={steamid}&format={fileformat}".format(key=self.Key,steamid=steamid,fileformat=fileformat))

    #Is Playing Shared Game
    def isPlayingSharedGame(self,steamid,appid_playing,fileformat='json'):
        return self._make_request("IPlayerService/IsPlayingSharedGame/v0001/?key={key}&steamid={steamid}&appid_playing={appid_playing}&format={fileformat}".format(key=self.Key,steamid=steamid,appid_playing=appid_playing,fileformat=fileformat))

    #Get Scheme For Game
    def getSchemaForGame(self,appid,fileformat='json'):
        return self._make_request("ISteamUserStats/GetSchemaForGame/v2/?key={key}&appid={appid}&format={fileformat}".format(key=self.Key,appid=appid,fileformat=fileformat))
    
    #Get Players Bans
    def getPlayerBans(self,steamids,fileformat='json'):
        return self._make_request("ISteamUser/GetPlayerBans/v1/?key={key}&steamids={steamids}&format={fileformat}".format(key=self.Key,steamids=steamids,fileformat=fileformat))


