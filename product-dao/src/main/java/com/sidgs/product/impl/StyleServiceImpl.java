package com.sidgs.product.impl;


import com.sidgs.product.StyleService;
import com.sidgs.product.model.StyleMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vytlasai on 2/11/2017.
 */

@Service
public class StyleServiceImpl implements StyleService {




    @Autowired
    JdbcTemplate jdbcTemplate;

    static final String INSERT ="insert into STYLE_MASTER (" +
            "STYLE_ID,STYLE_NAME,STYLE_DESCRIPTION,STYLE_BRAND,STYLE_COLOR) " +
            " VALUES (?,?,?,?,?)";

    static final String DELETE ="delete from STYLE_MASTER where STYLE_ID=?";

    public void add(StyleMaster style) {
        jdbcTemplate.update(INSERT, new Object[] {style.getStyleId(),
                style.getStyleId(),
                style.getStyleDescription(),
                style.getStyleBrand(),
                style.getStyleColor(),
                style.getStyleName() });



    }

    public List<StyleMaster> getStyles() {
        String sql ="Select * from styles";

        List<StyleMaster>  styles = jdbcTemplate.query(sql, new StyleMasterRowMapper<StyleMaster>());
        return getStylesfromSQL(sql, null);
    }

    private List<StyleMaster> getStylesfromSQL(String sql, Object[] args) {
        List<StyleMaster>  styles ;
        if ( args != null || args.length!= 0 ) {
            styles = jdbcTemplate.query(sql, args, new ProductRowMapper<StyleMaster>());
        } else  {
            styles = jdbcTemplate.query(sql, new ProductRowMapper<StyleMaster>());
        }
        return styles;
    }

    public StyleMaster getStyle(int id) {
        return null;
    }

    public void remove(int styleId) {
        String sql = "delete * from STYLE_MASTER where STYLE_ID ='" + styleId + "'";
        jdbcTemplate.execute(sql);

    }
}

class StyleMasterRowMapper<StyleMaster>  implements RowMapper<StyleMaster> {

    public StyleMaster mapRow(ResultSet resultSet, int i) throws SQLException {
        com.sidgs.product.model.StyleMaster style;
        style = new com.sidgs.product.model.StyleMaster();
        style.setStyleId(resultSet.getInt("id"));

        return (StyleMaster) style;
    }
}
