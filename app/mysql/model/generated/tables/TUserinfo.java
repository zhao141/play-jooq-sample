/**
 * This class is generated by jOOQ
 */
package mysql.model.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import mysql.model.generated.Keys;
import mysql.model.generated.Test;
import mysql.model.generated.tables.records.TUserinfoRecord;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUserinfo extends TableImpl<TUserinfoRecord> {

    private static final long serialVersionUID = -692990536;

    /**
     * The reference instance of <code>test.t_userinfo</code>
     */
    public static final TUserinfo T_USERINFO = new TUserinfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TUserinfoRecord> getRecordType() {
        return TUserinfoRecord.class;
    }

    /**
     * The column <code>test.t_userinfo.id</code>.
     */
    public final TableField<TUserinfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.t_userinfo.name</code>.
     */
    public final TableField<TUserinfoRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>test.t_userinfo</code> table reference
     */
    public TUserinfo() {
        this("t_userinfo", null);
    }

    /**
     * Create an aliased <code>test.t_userinfo</code> table reference
     */
    public TUserinfo(String alias) {
        this(alias, T_USERINFO);
    }

    private TUserinfo(String alias, Table<TUserinfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TUserinfo(String alias, Table<TUserinfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TUserinfoRecord> getPrimaryKey() {
        return Keys.KEY_T_USERINFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TUserinfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TUserinfoRecord>>asList(Keys.KEY_T_USERINFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserinfo as(String alias) {
        return new TUserinfo(alias, this);
    }

    /**
     * Rename this table
     */
    public TUserinfo rename(String name) {
        return new TUserinfo(name, null);
    }
}
