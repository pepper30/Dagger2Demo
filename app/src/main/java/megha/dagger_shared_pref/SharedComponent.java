package megha.dagger_shared_pref;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Megha Chauhan on 27-Oct-17.
 */
@Singleton
@Component(modules = SharedModule.class)
public interface SharedComponent {
    void inject(MainActivity mainActivity);
    void inject(DisplayActivity displayActivity);
}
