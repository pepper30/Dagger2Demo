package megha.dagger_shared_pref;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Megha Chauhan on 27-Oct-17.
 */
@Module
public class SharedModule {
 public Activity activity;
  public SharedModule(Activity activity){
      this.activity=activity;
  }

    @Provides
    @Singleton
    SharedPreferences getsharedPreferences(){
      return activity.getSharedPreferences("text",Context.MODE_PRIVATE);
  }
}
