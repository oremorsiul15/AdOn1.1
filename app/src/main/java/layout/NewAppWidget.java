package layout;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;


import com.adme11.ctrln.adme11.R;
import com.squareup.picasso.Picasso;

/**
 * Implementation of App Widget functionality.
 */
public class NewAppWidget extends AppWidgetProvider {



    @Override
    public void onUpdate(final Context context, AppWidgetManager appWidgetManager,
                         int[] appWidgetIds) {
        RemoteViews updateViews = new RemoteViews(context.getPackageName(), R.layout.new_app_widget);
        // Load image for all appWidgetIds.
        Picasso picasso = Picasso.with(context);

        picasso.load("http://www.sourcecertain.com/img/Example.png")
                .resize(250,250)
                .into(updateViews, R.id.imageView, appWidgetIds);
    }
}

