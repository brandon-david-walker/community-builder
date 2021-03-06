package dev.bearistotle.communitybuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

// TODO: Figure out error about accessing EnvironmentCapable
@SpringBootApplication
@EnableJdbcHttpSession
public class CommunityBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunityBuilderApplication.class, args);
	}

}
