package com.example.alumnusu;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    // creating a constant variables for our database.
    // below variable is for our database name.
    private static final String DB_NAME = "alumnusudb";

    // below int is our database version
    private static final int DB_VERSION = 1;

    // below variable is for our table name.
    private static final String TABLE_NAME = "alumni";

    // below variable is for our id column.
    private static final String ID_COL = "id_alumni";

    // below variable is for our course fakultas column
    private static final String FAKULTAS_COL = "fakultas";

    // below variable is for our course PROGRAM STUDI column
    private static final String PRODI_COL = "prodi";

    // below variable is for our course tahun masuk column
    private static final String STAMBUK_COL = "stambuk";

    // below variable is for our course NIM column
    private static final String NIM_COL = "nim";

    // below variable is for our course name column
    private static final String NAME_COL = "nama";

    // below variable is for our course email column
    private static final String EMAIL_COL = "email";

    // below variable id for our course duration column.
    private static final String PASS_COL = "password";

    // below variable for our course description column.
    private static final String USERTYPE_COL = "user_type";

    // creating a constructor for our database handler.
    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    // below method is for creating a database by running a sqlite query
    @Override
    public void onCreate(SQLiteDatabase db) {
        // on below line we are creating
        // an sqlite query and we are
        // setting our column names
        // along with their data types.
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + FAKULTAS_COL + " VARCHAR,"
                + PRODI_COL + " VARCHAR,"
                + STAMBUK_COL + " VARCHAR,"
                + NIM_COL + " INTEGER,"
                + NAME_COL + " VARCHAR,"
                + EMAIL_COL + " VARCHAR,"
                + PASS_COL + " VARCHAR,"
                + USERTYPE_COL + " INTEGER)";

        // at last we are calling a exec sql
        // method to execute above sql query
        db.execSQL(query);
    }

    // this method is use to add new course to our sqlite database.
    public void addNewCourse(String regisFaklutas, String regisProdi, String regisStambuk, String regisNim, String regisNama, String regisEmail, String regisPassword, String regisUsertype) {

        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        SQLiteDatabase db = this.getWritableDatabase();

        // on below line we are creating a
        // variable for content values.
        ContentValues values = new ContentValues();

        // on below line we are passing all values
        // along with its key and value pair.
        values.put(FAKULTAS_COL, regisFaklutas);
        values.put(PRODI_COL, regisProdi);
        values.put(STAMBUK_COL, regisStambuk);
        values.put(NIM_COL, regisNim);
        values.put(NAME_COL, regisNama);
        values.put(EMAIL_COL, regisEmail);
        values.put(PASS_COL, regisPassword);
        values.put(USERTYPE_COL, regisUsertype);

        // after adding all values we are passing
        // content values to our table.
        db.insert(TABLE_NAME, null, values);

        // at last we are closing our
        // database after adding database.
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
