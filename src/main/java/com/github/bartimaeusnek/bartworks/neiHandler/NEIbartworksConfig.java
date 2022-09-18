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

package com.github.bartimaeusnek.bartworks.neiHandler;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import com.github.bartimaeusnek.bartworks.MainMod;
import com.github.bartimaeusnek.bartworks.common.loaders.FluidLoader;
import com.github.bartimaeusnek.bartworks.common.loaders.ItemRegistry;
import cpw.mods.fml.common.Optional;
import gregtech.api.enums.OrePrefixes;
import net.minecraft.item.ItemStack;

import static com.github.bartimaeusnek.bartworks.system.material.BW_Materials.Bismutite;
import static com.github.bartimaeusnek.bartworks.system.material.WerkstoffLoader.getCorrespondingItemStack;


@Optional.Interface(iface = "codechicken.nei.api.API", modid = "NotEnoughItems")
public class NEIbartworksConfig implements IConfigureNEI {

    @Optional.Method(modid = "NotEnoughItems")
    @Override
    public String getName() {
        return MainMod.NAME;
    }

    @Optional.Method(modid = "NotEnoughItems")
    @Override
    public String getVersion() {
        return MainMod.VERSION;
    }

    @Optional.Method(modid = "NotEnoughItems")
    @Override
    public void loadConfig() {
        API.hideItem(new ItemStack(ItemRegistry.TAB));
        API.hideItem(new ItemStack(FluidLoader.bioFluidBlock));
        API.hideItem(new ItemStack(ItemRegistry.bw_fake_glasses));
        ItemStack[] prefixesToHide = {
                getCorrespondingItemStack(OrePrefixes.dustTiny, Bismutite).copy(),
                getCorrespondingItemStack(OrePrefixes.dustSmall, Bismutite).copy(),
                getCorrespondingItemStack(OrePrefixes.crushed, Bismutite).copy(),
                getCorrespondingItemStack(OrePrefixes.crushedPurified, Bismutite).copy(),
                getCorrespondingItemStack(OrePrefixes.crushedCentrifuged, Bismutite).copy(),
                getCorrespondingItemStack(OrePrefixes.nugget, Bismutite).copy(),
                getCorrespondingItemStack(OrePrefixes.gemChipped, Bismutite).copy(),
                getCorrespondingItemStack(OrePrefixes.gemFlawed, Bismutite).copy(),
                getCorrespondingItemStack(OrePrefixes.gemFlawless, Bismutite).copy(),
                getCorrespondingItemStack(OrePrefixes.gemExquisite, Bismutite).copy(),
                getCorrespondingItemStack(OrePrefixes.dustImpure, Bismutite).copy(),
                getCorrespondingItemStack(OrePrefixes.dustPure, Bismutite).copy(),
        };
        for (ItemStack stack : prefixesToHide) {
            stack.setItemDamage(Short.MAX_VALUE);
            API.hideItem(stack);
        }
//        for (int i = 0; i < Short.MAX_VALUE; i++) {
//            API.addItemListEntry(new ItemStack(BWOres,1,i));
//        }
    }
}