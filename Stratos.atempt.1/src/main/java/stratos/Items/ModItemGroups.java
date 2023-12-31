package stratos.Items;

import com.google.common.io.Closer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import stratos.block.ModBlocks;
import stratos.mod.ExampleMod;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ExampleMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);

                        entries.add(ModBlocks.RUBY_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);

                        entries.add(ModBlocks.STRATOS_STONE);

                        entries.add(ModBlocks.COBBLED_STRATOS_STONE);

                        entries.add(ModBlocks.FRAME);

                        entries.add(ModBlocks.FRAME_FILLED);

                        entries.add(ModBlocks.FRAME_PORTAL);



                    }).build());


    public static void registerItemGroups() {
        ExampleMod.LOGGER.info("Registering Item Groups for " + ExampleMod.MOD_ID);
    }
}

