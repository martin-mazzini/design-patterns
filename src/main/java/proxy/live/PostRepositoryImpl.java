package proxy.live;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostRepositoryImpl  {



    public String getPost(final String postId){
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/" + postId);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println(response.toString());
                return response.toString();
            } else {
                System.out.println("GET request failed");
                throw new RuntimeException("Error getting post");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error getting post");
        }
    }

}
