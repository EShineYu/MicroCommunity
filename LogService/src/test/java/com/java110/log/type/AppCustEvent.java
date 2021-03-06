package com.java110.log.type;

import com.java110.core.context.AppContext;


/**
 * 客户事件
 * Created by wuxw on 2017/4/14.
 */
public class AppCustEvent extends AppEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public AppCustEvent(Object source, AppContext context) {
        super(source,context);
    }

}
