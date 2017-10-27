package megha.dagger_shared_pref;

import dagger.Component;

/**
 * Created by Megha Chauhan on 27-Oct-17.
 */
@Component(modules = SharedModule.class)
public interface SharedComponent {
    void inject(MainActivity mainActivity);
    void inject(DisplayActivity displayActivity);
}
