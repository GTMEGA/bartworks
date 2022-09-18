/*
 * Copyright (c) 2018-2020 bartimaeusnek
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.bartimaeusnek.bartworks.util;

import com.github.bartimaeusnek.bartworks.API.BioVatLogicAdder;
import gregtech.api.enums.Materials;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

@SuppressWarnings({"unused","RedundantSuppression"})
public class BW_Util {
    private static Block bw_realglasRef;

    public static int calculateSv(Materials materials) {
        for (BioVatLogicAdder.MaterialSvPair pair : BioVatLogicAdder.RadioHatch.getMaSv()) {
            if (pair.getMaterials().equals(materials))
                return pair.getSievert();
        }
        return (int) (materials.getProtons() == 43L ? (materials.equals(Materials.NaquadahEnriched) ? 140 : materials.equals(Materials.Naquadria) ? 150 : materials.equals(Materials.Naquadah) ? 130 : 43) : materials.getProtons());
    }

    public static byte calculateGlassTier(@Nonnull Block block, @Nonnegative byte meta) {
        if (bw_realglasRef == null){
            try {
                bw_realglasRef = (Block) Class.forName("com.github.bartimaeusnek.bartworks.common.loaders.ItemRegistry").getField("bw_realglas").get(null);
            } catch (IllegalAccessException | NoSuchFieldException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        if (block.equals(bw_realglasRef))
            return meta == 12 ? 5 : meta > 1 && meta < 6 ? (byte) (meta + 3) : 4;

        if (block.getUnlocalizedName().equals("blockAlloyGlass"))
            return 4;

        if (block.equals(Blocks.glass))
            return 3;

        for (BioVatLogicAdder.BlockMetaPair B : BioVatLogicAdder.BioVatGlass.getGlassMap().keySet())
            if (B.getBlock().equals(block) && B.getaByte().equals(meta))
                return BioVatLogicAdder.BioVatGlass.getGlassMap().get(B);

        if (block.getMaterial().equals(Material.glass))
            return 3;

        return 0;
    }
}