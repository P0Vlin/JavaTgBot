package ru.desmo.javatgbot.data_container;

import lombok.Data;
import lombok.Getter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@Configuration
@Data
@PropertySource("app.properties")
public class BotConfig {
    public static final String botName = "nameofbot";
    public static final String token = "bottoken";
}