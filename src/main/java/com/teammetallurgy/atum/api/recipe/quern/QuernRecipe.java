package com.teammetallurgy.atum.api.recipe.quern;

import com.teammetallurgy.atum.Atum;
import com.teammetallurgy.atum.api.recipe.IAtumRecipeType;
import com.teammetallurgy.atum.api.recipe.RotationRecipe;
import com.teammetallurgy.atum.blocks.machines.tileentity.QuernTileEntity;
import com.teammetallurgy.atum.init.AtumRecipeSerializers;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class QuernRecipe extends RotationRecipe<QuernTileEntity> {

    public QuernRecipe(@Nonnull ItemStack input, @Nonnull ItemStack output, int rotations) {
        this(Ingredient.fromStacks(input), output, rotations);
    }

    public QuernRecipe(Ingredient input, @Nonnull ItemStack output, int rotations) {
        this(new ResourceLocation(Atum.MOD_ID, "spinning_wheel"), input, output, rotations);
    }

    public QuernRecipe(ResourceLocation id, Ingredient input, @Nonnull ItemStack output, int rotations) {
        super(IAtumRecipeType.QUERN, id, input, output, rotations);
    }

    @Override
    @Nonnull
    public IRecipeSerializer<?> getSerializer() {
        return AtumRecipeSerializers.QUERN;
    }
}