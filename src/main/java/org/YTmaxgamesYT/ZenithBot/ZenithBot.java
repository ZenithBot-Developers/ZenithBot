package org.YTmaxgamesYT.ZenithBot;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;

public class ZenithBot {

    private final ShardManager shardManager;
    private final Dotenv config;

    public ZenithBot() throws LoginException {
        config = Dotenv.configure().load();
        String token = config.get("TOKEN");
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.watching("z!help - Command helper!"));
        shardManager = builder.build();
    }

    public static void main(String[] args) {
        try{
            ZenithBot bot = new ZenithBot();
        }catch(LoginException e){
            System.out.printf("Login Error: %s\n",e.getMessage());
        }
    }
}