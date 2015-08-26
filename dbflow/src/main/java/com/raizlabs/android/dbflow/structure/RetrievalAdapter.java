package com.raizlabs.android.dbflow.structure;

import android.database.Cursor;

import com.raizlabs.android.dbflow.sql.builder.ConditionQueryBuilder;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;

/**
 * Description: Provides a base retrieval interface for all {@link com.raizlabs.android.dbflow.structure.Model} backed
 * adapters.
 */
public interface RetrievalAdapter<TableClass extends Model, ModelClass extends Model> {

    /**
     * Assigns the {@link android.database.Cursor} data into the specified {@link ModelClass}
     *
     * @param model  The model to assign cursor data to
     * @param cursor The cursor to load into the model
     */
    void loadFromCursor(Cursor cursor, ModelClass model);

    /**
     * @param model The model to query values from
     * @return True if it exists as VIEW row in the database table
     */
    boolean exists(ModelClass model);

    ConditionGroup getPrimaryConditions(ModelClass model);

}
