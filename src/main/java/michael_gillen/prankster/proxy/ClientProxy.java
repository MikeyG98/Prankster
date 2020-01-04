package michael_gillen.prankster.proxy;

import michael_gillen.prankster.init.ModBlocks;
import michael_gillen.prankster.init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModBlocks.registerRenderTileEntities();
	}
}
