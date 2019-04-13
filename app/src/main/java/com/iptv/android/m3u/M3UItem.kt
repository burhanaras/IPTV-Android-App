package com.muparse

import java.io.Serializable

class M3UItem : Serializable {

    var itemDuration: String? = null
    var itemName: String? = null
    var itemUrl: String? = null
    var itemIcon: String? = null
    var groupTitle: String? = null

    override fun toString(): String {
        return "M3UItem(itemDuration=$itemDuration, itemName=$itemName, itemUrl=$itemUrl, itemIcon=$itemIcon, groupTitle=$groupTitle)"
    }


}
