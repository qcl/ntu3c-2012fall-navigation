package ntu3c.t2012fall.navigation;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.ShareActionProvider;
import android.widget.Toast;

public class MainActivity extends Activity {

	private ShareActionProvider mShareActionProvider;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		//share action provider. API14+
		mShareActionProvider = (ShareActionProvider) menu.findItem(R.id.menu_share).getActionProvider();
		
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("image/*");
		
		mShareActionProvider.setShareIntent(intent);
		
		
		//search view
		//TODO search interface -> maybe a new topic!
		//SearchView searchView = (SearchView) menu.findItem(R.id.menu_search).getActionView();
		
		
		
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
			//API11+
			case android.R.id.home:
				Toast.makeText(getApplicationContext(), "Back!", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.menu_settings:
				Toast.makeText(getApplicationContext(), "settings", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.menu_qcl:
				Toast.makeText(getApplicationContext(), "qcl", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.menu_qcl2:
				Toast.makeText(getApplicationContext(), "qcl2", Toast.LENGTH_SHORT).show();
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

}
