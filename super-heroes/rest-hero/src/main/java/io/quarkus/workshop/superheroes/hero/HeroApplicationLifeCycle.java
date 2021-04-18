package io.quarkus.workshop.superheroes.hero;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
class HeroApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(HeroApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("\n" +
            " (                   )     *        )   (    (             )  \n" +
            " )\\ )        (    ( /(   (  `    ( /(   )\\ ) )\\ )  (    ( /(  \n" +
            "(()/(   (    )\\   )\\())  )\\))(   )\\()) (()/((()/(  )\\   )\\()) \n" +
            " /(_))  )\\ (((_)|((_)\\  ((_)()\\ ((_)\\   /(_))/(_)|((_)|((_)\\  \n" +
            "(_)) _ ((_))\\___|_ ((_) (_()((_)_ ((_) (_))_(_)) )\\___|_ ((_) \n" +
            "/ __| | | ((/ __| |/ /  |  \\/  \\ \\ / /  |   \\_ _((/ __| |/ /  \n" +
            "\\__ \\ |_| || (__  ' <   | |\\/| |\\ V /   | |) | | | (__  ' <   \n" +
            "|___/\\___/  \\___|_|\\_\\  |_|  |_| |_|    |___/___| \\___|_|\\_\\  \n" +
            "                                                              \n");
        LOGGER.info("                         Powered by Quarkus");
        LOGGER.infof("The application HERO is starting with profile `%s`", ProfileManager.getActiveProfile());
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application HERO is stopping...");
    }

}
