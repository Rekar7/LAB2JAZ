package org.example.tools.geographies;

import org.example.model.Geography;

public class GeographyParser implements org.example.tools.abstractions.IParse<org.example.model.Geography> {
    @Override
    public Geography parse(String line) {
        Geography geography = new Geography();
        String regex = ";";
        line = line.trim();
        String[] strArray = line.split(regex);

        geography.setId(Integer.parseInt(strArray[0]));
        geography.setType(strArray[1]);
        geography.setName(strArray[2]);
        geography.setCode(strArray[3]);
        if (!strArray[4].equals("NULL")) {
            geography.setParentId(Integer.parseInt(strArray[4]));
        }

        return geography;
    }
}
