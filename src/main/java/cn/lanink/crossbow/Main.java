package cn.lanink.crossbow;

import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;

import java.util.Random;

/**
 * @author lt_name
 */
public class Main extends PluginBase {

    public static final Random RANDOM = new Random();

    @Override
    public void onEnable() {
        Item.list[471] = ItemCrossbow.class;

        this.getLogger().info("加载完成！");
    }

}
