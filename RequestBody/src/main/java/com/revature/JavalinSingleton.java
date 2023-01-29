package com.revature;

import io.javalin.Javalin;

/**
 * Background: A json string representing a song will be sent in this POST request with the following fields: 
 *      songName, artistName
 */
public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * problem1: retrieve the song object from the request body and return the artist name.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem1", ctx -> {
            String jsonString = ctx.body();
            ObjectMapper om = new ObjectMapper();
            Song song = om.readValue(jsonString, valueType: song.class);

           
        });

       

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem2", ctx -> {
            String jsonString = ctx.body();

            
            ObjectMapper om = new ObjectMapper();
            Song artist = om.readValue(jsonString, valueType: Song.class);
        
            
            ctx.contentType("application/json"); 
        
            
            artist.setArtistName("Beatles");
            
            
            String jsonStringToBeReturned = om.writeValueAsString(artist);
        
            
            ctx.result(jsonStringToBeReturned);
        });
        return app;
    }
    
}
