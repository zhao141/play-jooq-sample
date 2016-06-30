/**
 * This class is generated by jOOQ
 */
package mysql.model.generated;


import javax.annotation.Generated;

import mysql.model.generated.tables.TUserinfo;
import mysql.model.generated.tables.records.TUserinfoRecord;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>test</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TUserinfoRecord> KEY_T_USERINFO_PRIMARY = UniqueKeys0.KEY_T_USERINFO_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<TUserinfoRecord> KEY_T_USERINFO_PRIMARY = createUniqueKey(TUserinfo.T_USERINFO, "KEY_t_userinfo_PRIMARY", TUserinfo.T_USERINFO.ID);
    }
}
