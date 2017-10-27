package megha.dagger_shared_pref;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Megha Chauhan on 27-Oct-17.
 */
@Module
public class SharedModule {
 private Activity activity;
  public SharedModule(Activity activity){
      this.activity=activity;
  }

    @Provides
    SharedPreferences getsharedPreferences(){
      return activity.getSharedPreferences("Mypref",Context.MODE_PRIVATE);
  }
}
