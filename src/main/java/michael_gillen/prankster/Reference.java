package michael_gillen.prankster;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class Reference {
	public static final String MODID = "prankster";
    public static final String MODNAME = "Prankster";
    public static final String VERSION = "1.0";
    public static final String CLIENT_PROXY_CLASS = "michael_gillen.prankster.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "michael_gillen.prankster.proxy.ServerProxy";
    
    public static final Material PRANKCHEST = new Material(MapColor.PINK);
    
    public static enum pranksterItems {
    	ITEMPRANKBASE("prankbase", "ItemPrankBase"),
    	ITEMPRANKCREEPER("prankcreeper", "ItemPrankCreeper"),
    	ITEMPRANKLIGHTNING("pranklighting", "ItemPrankLightning"),
    	ITEMPRANKTNT("pranktnt", "ItemPrankTnt"),
    	ITEMPRANKPOTION("prankpotion", "ItemPrankPotion"),
    	ITEMPRANKWITHER("prankwithereffect", "ItemPrankWither"),
    	ITEMPRANKLAVA("pranklava", "ItemPrankLava"),
    	ITEMPRANKFIRE("prankfire", "ItemPrankFire"),
    	ITEMPRANKNETHERPORT("pranknetherport", "ItemPrankNetherport"),
    	ITEMPRANKENDERPORT("prankenderport", "ItemPrankEnderPort");
    	
    	
    	
    	private String unlocalizedName;
    	private String registryName;
    	
    	pranksterItems(String unlocalizedName, String registryName) {
    		this.unlocalizedName = unlocalizedName;
    		this.registryName = registryName;
    	}
    	
    	public String getRegistryName() {
    		return registryName;
    	}
    	
    	public String getUnlocalizedName() {
    		return unlocalizedName;
    	}
    }
    
    public static enum pranksterBlocks {
    	PRANKCHEST("prankchest", "BlockPrankChest");
    	
    	private String unlocalizedName;
    	private String registryName;
    	
    	pranksterBlocks(String unlocalizedName, String registryName) {
    		this.unlocalizedName = unlocalizedName;
    		this.registryName = registryName;
    	}
    	
    	public String getRegistryName() {
    		return registryName;
    	}
    	
    	public String getUnlocalizedName() {
    		return unlocalizedName;
    	}
    }
}
