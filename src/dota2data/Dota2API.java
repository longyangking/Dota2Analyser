package dota2data;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * The Dota2 API class that deal with all things about the data from Valve
 * @author longyang
 *
 * The data form used here is Json (default).
 */
public class Dota2API {
	private String requesthead = "http://api.steampowered.com/";
	public Dota2API(){
		
	}
	public String GetNewsForApp(String appid, int count, int maxlength, String format){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("ISteamNews/GetNewsForApp/v0002/?");
		request.append("appid="+appid);
		request.append("&count="+count);
		request.append("&maxlength"+maxlength);
		request.append("&format="+format);
	}
	public String GetGlobalAchievementPercentagesForApp(String gameid, String format){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("ISteamUserStats/GetGlobalAchievementPercentagesForApp/v0002/?");
		request.append("gameid="+gameid);
		request.append("&format="+format);
	}
	public String GetGlobalStatsForGame(String gameid, int count, String name, String format){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("ISteamUserStats/GetGlobalStatsForGame/v0001/?");
		request.append("format="+format);
		request.append("&appid="+gameid);
		request.append("&count="+count);
		request.append("&name[0]="+name);
	}
	public String GetPlayerSummaries(String steamid){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("ISteamUser/GetPlayerSummaries/v0002/?");
		request.append("key="+Config.KEY);
		request.append("&steamids="+steamid);
	}
	public String GetFriendList(String steamid){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("ISteamUser/GetFriendList/v0001/?");
		request.append("key="+Config.KEY);
		request.append("&steamid="+steamid);
		request.append("&relationship=friend");
	}
	public String GetPlayerAchievements(String steamid, String appid){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("ISteamUserStats/GetPlayerAchievements/v0001/?");
		request.append("key="+Config.KEY);
		request.append("&appid="+appid);
		request.append("&steamid="+steamid);
	}
	public String GetUserStatsForGame(String steamid, String appid){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("ISteamUserStats/GetUserStatsForGame/v0002/?");
		request.append("key="+Config.KEY);
		request.append("&appid="+appid);
		request.append("&steamid="+steamid);
	}
	public String GetOwnedGames(String steamid){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("IPlayerService/GetOwnedGames/v0001/?");
		request.append("key="+Config.KEY);
		request.append("&steamid="+steamid);
	}
	public String GetRecentlyPlayedGames(String steamid, int count){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("IPlayerService/GetRecentlyPlayedGames/v0001/?");
		request.append("key="+Config.KEY);
		request.append("&steamid="+steamid);
	}
	public String IsPlayingSharedGame(String steamid, String appid_playing){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("IPlayerService/IsPlayingSharedGame/v0001/?");
		request.append("key="+Config.KEY);
		request.append("&steamid="+steamid);
		request.append("&appid_playing="+appid_playing);
	}
	public String GetSchemaForGame(String appid){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("ISteamUserStats/GetSchemaForGame/v2/?");
		request.append("key="+Config.KEY);
		request.append("&appid="+appid);
	}
	public String GetPlayerBans(String steamids){
		StringBuffer request = new StringBuffer(requesthead);
		request.append("ISteamUser/GetPlayerBans/v1/?");
		request.append("key="+Config.KEY);
		request.append("&steamids="+steamids);
	}
	private String Request(String url){
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet(url);
			CloseableHttpResponse response = httpclient.execute(httpget);
		}catch(){ // TODO Finish Exceptions
			
		}
		
	}
}
