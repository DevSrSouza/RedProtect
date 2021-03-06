package br.net.fabiozumbi12.RedProtect.Core.config.Category;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

import java.util.HashMap;
import java.util.Map;

@ConfigSerializable
public class EconomyCategory {

    @Setting(value = "claim-cost-per-block")
    public claimCostPerBlockCat claim_cost_per_block = new claimCostPerBlockCat();
    @Setting(value = "economy-name")
    public String economy_name = "Coins";
    @Setting(value = "economy-symbol")
    public String economy_symbol = "$";
    @Setting(value = "max-area-toget-value")
    public int max_area_toget_value = 100000;
    @Setting(value = "rename-region")
    public boolean rename_region = false;
    @Setting
    public enchantmentsCat enchantments = new enchantmentsCat();
    @Setting
    public itemsCat items = new itemsCat();

    public EconomyCategory() {
    }

    @ConfigSerializable
    public static class claimCostPerBlockCat {

        @Setting(value = "cost-per-block")
        public int cost_per_block = 10;
        @Setting
        public boolean enable = false;
        @Setting(value = "y-is-free")
        public boolean y_is_free = true;
    }

    @ConfigSerializable
    public static class enchantmentsCat {

        @Setting
        public Map<String, Long> values = new HashMap<>();
    }

    @ConfigSerializable
    public static class itemsCat {

        @Setting
        public Map<String, Long> values = new HashMap<>();
    }
}
