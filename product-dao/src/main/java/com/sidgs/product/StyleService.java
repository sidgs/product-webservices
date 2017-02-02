package com.sidgs.product;


import com.sidgs.product.model.StyleMaster;

import java.util.List;


public interface StyleService {
	

    /**
     *
     * Adds a new style to the Map
     */
	void add(StyleMaster style);

    /**
     *
     * Returns the list of styles in the Map
     */
    List<StyleMaster> getStyles() ;

    /**
     *
     * Returns a particular style using ID
     */
    StyleMaster getStyle(int id);

    /**
     *
     *Deletes a particular style using ID
     */
    void remove(int styleId);

  
}
