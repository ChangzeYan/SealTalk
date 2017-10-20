package cn.rongcloud.im;

import android.content.Context;

import com.facebook.stetho.inspector.database.DatabaseConnectionProvider;
import com.facebook.stetho.inspector.database.DatabaseFilesProvider;
import com.facebook.stetho.inspector.database.SqliteDatabaseDriver;


public class RongDatabaseDriver extends SqliteDatabaseDriver {
    public RongDatabaseDriver(Context context) {
        super(context);
    }

    public RongDatabaseDriver(Context context, DatabaseFilesProvider databaseFilesProvider, DatabaseConnectionProvider databaseConnectionProvider) {
        super(context, databaseFilesProvider, databaseConnectionProvider);
    }
}
