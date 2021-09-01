package com.example.demowt.strategy.travelenum;

/**
 * @author caowq
 * @date 2021-08-31 16:59
 */
public enum TravelTypeEnum {

    TRAVEL_TYPE_BASE_GEOGRAPHICAL_LANDSCAPE("地文景观类", "GL"),
    TRAVEL_TYPE_BASE_CULTURAL_LANDSCAPE("人文景观类", "CL"),
    TRAVEL_TYPE_BASE_RELIGIOUS_CULTURE("宗教文化类", "RC"),
    TRAVEL_TYPE_BASE_URBAN_AND_RURAL_STYLE("城乡风貌类", "UARS"),
    TRAVEL_TYPE_BASE_ARTIFICIAL_LANDSCAPE("人工造景类", "AL"),
    TRAVEL_TYPE_BASE_CATERING_AND_SHOPPING("饮食购物类", "CAS"),
    TRAVEL_TYPE_BASE_OTHER("其他类", "OT");

    private String name;
    private String value;

    TravelTypeEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public static String getNameByValue(String value){
        for(TravelTypeEnum e : TravelTypeEnum.values()){
            if(e.getValue().equals(value)){
                return e.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
