package megha.dagger_shared_pref;

import android.app.Application;

import dagger.internal.DaggerCollections;

/**
 * Created by Megha Chauhan on 27-Oct-17.
 */

public class MyApp  extends Application{
    private SharedComponent sharedComponent;
    @Override
    public void onCreate(){
        super.onCreate();

    }
    public SharedComponent getSharedComponent(){
        return sharedComponent;
    }
}
