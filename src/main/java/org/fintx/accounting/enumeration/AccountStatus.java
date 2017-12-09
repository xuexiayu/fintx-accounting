package org.fintx.accounting.enumeration;

import org.fintx.lang.Codeable;

public enum AccountStatus  implements Codeable<Integer>{
    NORMAL(1), CLOSED(2);
    private Integer code;

    private AccountStatus(Integer code) {
        this.code = code;
    }

    @Override
    public Integer getCode() {
        // TODO Auto-generated method stub
        return code;
    }
}
