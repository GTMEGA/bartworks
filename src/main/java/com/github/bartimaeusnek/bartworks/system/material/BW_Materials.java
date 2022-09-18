package com.github.bartimaeusnek.bartworks.system.material;

import com.github.bartimaeusnek.bartworks.util.Pair;
import gregtech.api.enums.Element;
import gregtech.api.enums.Materials;
import gregtech.api.enums.SubTag;
import gregtech.api.enums.TextureSet;
import gregtech.api.interfaces.ISubTagContainer;
import gregtech.api.util.GT_OreDictUnificator;

import java.util.Arrays;
import java.util.Collections;

import static com.github.bartimaeusnek.bartworks.system.material.WerkstoffLoader.*;
import static com.github.bartimaeusnek.bartworks.util.BW_Werkstoff_Util.subscriptNumbers;
import static com.github.bartimaeusnek.bartworks.util.BW_Werkstoff_Util.superscriptNumbers;
import static gregtech.api.enums.OrePrefixes.*;

public final class BW_Materials {
    //TODO:
    //FREE ID RANGE:                11_000-28_998
    //bartimaeusnek reserved             0-10_000
    //GlodBlock reserved range      10_001-10_999
    //bot reserved range            29_899-29_999
    //Tec & basdxz reserved range   30_000-31_000
    //GT Material range reserved on 31_767-32_767
    public static final Werkstoff Bismutite = new Werkstoff(
            new short[]{255, 233, 0, 0},
            "Bismutite",
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems(),
            1,
            TextureSet.SET_FLINT,
            Collections.singletonList(Materials.Bismuth),
            new Pair<>(Materials.Bismuth, 2),
            new Pair<>(Materials.Oxygen, 2),
            new Pair<>(Materials.CarbonDioxide, 2)
    );
    public static final Werkstoff Bismuthinit = new Werkstoff(
            new short[]{192, 192, 192, 0},
            "Bismuthinite",
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            2,
            TextureSet.SET_METALLIC,
            Arrays.asList(Materials.Bismuth, Materials.Sulfur),
            new Pair<>(Materials.Bismuth, 2),
            new Pair<>(Materials.Sulfur, 3)
    );
    public static final Werkstoff Zirconium = new Werkstoff(
            new short[]{175, 175, 175, 0},
            "Zirconium",
            "Zr",
            new Werkstoff.Stats().setProtons(40).setMeltingPoint(2130),
            Werkstoff.Types.ELEMENT,
            new Werkstoff.GenerationFeatures().onlyDust().enforceUnification(),
            3,
            TextureSet.SET_METALLIC
            //No Byproducts
    );
    public static final Werkstoff CubicZirconia = new Werkstoff(
            new short[]{255, 255, 255, 0},
            "Cubic Zirconia",
            Werkstoff.Types.COMPOUND,
            3273,
            new Werkstoff.GenerationFeatures().onlyDust().addGems().enforceUnification(),
            4,
            TextureSet.SET_DIAMOND,
            Collections.singletonList(Zirconium),
            new Pair<>(Zirconium, 1),
            new Pair<>(Materials.Oxygen, 2)
    );
    public static final Werkstoff FluorBuergerit = new Werkstoff(
            new short[]{0x20, 0x20, 0x20, 0},
            "Fluor-Buergerite",
            subscriptNumbers("NaFe3Al6(Si6O18)(BO3)3O3F"),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems(),
            5,
            TextureSet.SET_RUBY,
            Arrays.asList(Materials.Sodium, Materials.Boron, Materials.Silicon),
            new Pair<>(Materials.Sodium, 1),
            new Pair<>(Materials.Iron, 3),
            new Pair<>(Materials.Aluminium, 6),
            new Pair<>(Materials.Silicon, 6),
            new Pair<>(Materials.Boron, 3),
            new Pair<>(Materials.Oxygen, 30),
            new Pair<>(Materials.Fluorine, 1)
    );
    public static final Werkstoff YttriumOxide = new Werkstoff(
            new short[]{255, 255, 255, 0},
            "Yttrium Oxide",
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().onlyDust().enforceUnification(), //No autoadd here to gate this material by hand
            6,
            TextureSet.SET_DULL,
            new Pair<>(Materials.Yttrium, 2),
            new Pair<>(Materials.Oxygen, 3)
    );
    public static final Werkstoff ChromoAluminoPovondrait = new Werkstoff(
            new short[]{0, 0x79, 0x6A, 0},
            "Chromo-Alumino-Povondraite",
            subscriptNumbers("NaCr3(Al4Mg2)(Si6O18)(BO3)3(OH)3O"),
            Werkstoff.Types.getDefaultStatForType(Werkstoff.Types.COMPOUND),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems(),
            7,
            TextureSet.SET_RUBY,
            Arrays.asList(Materials.Sodium, Materials.Boron, Materials.Silicon),
            new Pair<>(Materials.Sodium, 1),
            new Pair<>(Materials.Chrome, 3),
            new Pair<>(Materials.Magnalium, 6),
            new Pair<>(Materials.Silicon, 6),
            new Pair<>(Materials.Boron, 3),
            new Pair<>(Materials.Oxygen, 31),
            new Pair<>(Materials.Hydrogen, 3)
    );
    public static final Werkstoff VanadioOxyDravit = new Werkstoff(
            new short[]{0x60, 0xA0, 0xA0, 0},
            "Vanadio-Oxy-Dravite",
            subscriptNumbers("NaV3(Al4Mg2)(Si6O18)(BO3)3(OH)3O"),
            Werkstoff.Types.getDefaultStatForType(Werkstoff.Types.COMPOUND),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems(),
            8,
            TextureSet.SET_RUBY,
            Arrays.asList(Materials.Sodium, Materials.Boron, Materials.Silicon),
            new Pair<>(Materials.Sodium, 1),
            new Pair<>(Materials.Vanadium, 3),
            new Pair<>(Materials.Magnalium, 6),
            new Pair<>(Materials.Silicon, 6),
            new Pair<>(Materials.Boron, 3),
            new Pair<>(Materials.Oxygen, 31),
            new Pair<>(Materials.Hydrogen, 3)
    );
    public static final Werkstoff Olenit = new Werkstoff(
            new short[]{210, 210, 210, 0},
            "Olenite",
            subscriptNumbers("NaAl3Al6(Si6O18)(BO3)3O3OH"),
            Werkstoff.Types.getDefaultStatForType(Werkstoff.Types.COMPOUND),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems(),
            9,
            TextureSet.SET_RUBY,
            Arrays.asList(Materials.Sodium, Materials.Boron, Materials.Silicon),
            new Pair<>(Materials.Sodium, 1),
            new Pair<>(Materials.Aluminium, 9),
            new Pair<>(Materials.Silicon, 6),
            new Pair<>(Materials.Boron, 3),
            new Pair<>(Materials.Oxygen, 31),
            new Pair<>(Materials.Hydrogen, 1)
    );
    public static final Werkstoff Arsenopyrite = new Werkstoff(
            new short[]{0xB0, 0xB0, 0xB0, 0},
            "Arsenopyrite",
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            10,
            TextureSet.SET_METALLIC,
            Arrays.asList(Materials.Sulfur, Materials.Arsenic, Materials.Iron),
            new Pair<>(Materials.Iron, 1),
            new Pair<>(Materials.Arsenic, 1),
            new Pair<>(Materials.Sulfur, 1)
    );
    public static final Werkstoff Ferberite = new Werkstoff(
            new short[]{0xB0, 0xB0, 0xB0, 0},
            "Ferberite",
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            11,
            TextureSet.SET_METALLIC,
            Arrays.asList(Materials.Iron, Materials.Tungsten),
            new Pair<>(Materials.Iron, 1),
            new Pair<>(Materials.Tungsten, 1),
            new Pair<>(Materials.Oxygen, 3)
    );
    public static final Werkstoff Loellingit = new Werkstoff(
            new short[]{0xD0, 0xD0, 0xD0, 0},
            "Loellingite",
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            12,
            TextureSet.SET_METALLIC,
            Arrays.asList(Materials.Iron, Materials.Arsenic),
            new Pair<>(Materials.Iron, 1),
            new Pair<>(Materials.Arsenic, 2)
    );
    public static final Werkstoff Roquesit = new Werkstoff(
            new short[]{0xA0, 0xA0, 0xA0, 0},
            "Roquesite",
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            13,
            TextureSet.SET_METALLIC,
            Arrays.asList(Materials.Copper, Materials.Sulfur),
            new Pair<>(Materials.Copper, 1),
            new Pair<>(Materials.Indium, 1),
            new Pair<>(Materials.Sulfur, 2)
    );
    public static final Werkstoff Bornite = new Werkstoff(
            new short[]{0x97, 0x66, 0x2B, 0},
            "Bornite",
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            14,
            TextureSet.SET_METALLIC,
            Arrays.asList(Materials.Copper, Materials.Iron, Materials.Sulfur),
            new Pair<>(Materials.Copper, 5),
            new Pair<>(Materials.Iron, 1),
            new Pair<>(Materials.Sulfur, 4)
    );
    public static final Werkstoff Wittichenit = new Werkstoff(
            Materials.Copper.mRGBa,
            "Wittichenite",
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            15,
            TextureSet.SET_METALLIC,
            Arrays.asList(Materials.Copper, Materials.Bismuth, Materials.Sulfur),
            new Pair<>(Materials.Copper, 5),
            new Pair<>(Materials.Bismuth, 1),
            new Pair<>(Materials.Sulfur, 4)
    );
    public static final Werkstoff Djurleit = new Werkstoff(
            new short[]{0x60, 0x60, 0x60, 0},
            "Djurleite",
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            16,
            TextureSet.SET_METALLIC,
            Arrays.asList(Materials.Copper, Materials.Copper, Materials.Sulfur),
            new Pair<>(Materials.Copper, 31),
            new Pair<>(Materials.Sulfur, 16)
    );
    public static final Werkstoff Huebnerit = new Werkstoff(
            new short[]{0x80, 0x60, 0x60, 0},
            "Huebnerite",
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            17,
            TextureSet.SET_METALLIC,
            Arrays.asList(Materials.Manganese, Materials.Tungsten),
            new Pair<>(Materials.Manganese, 1),
            new Pair<>(Materials.Tungsten, 1),
            new Pair<>(Materials.Oxygen, 3)
    );
    public static final Werkstoff Thorianit = new Werkstoff(
            new short[]{0x30, 0x30, 0x30, 0},
            "Thorianite",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            18,
            TextureSet.SET_METALLIC,
            Collections.singletonList(Materials.Thorium),
            new Pair<>(Materials.Thorium, 1),
            new Pair<>(Materials.Oxygen, 2)
    );
    public static final Werkstoff RedZircon = new Werkstoff(
            new short[]{195, 19, 19, 0},
            "Red Zircon",
            new Werkstoff.Stats().setElektrolysis(true).setMeltingPoint(2130),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems(),
            19,
            TextureSet.SET_GEM_VERTICAL,
            Arrays.asList(Zirconium, Materials.Silicon),
            new Pair<>(Zirconium, 1),
            new Pair<>(Materials.Silicon, 1),
            new Pair<>(Materials.Oxygen, 4)
    );

    //GT Enhancements
    public static final Werkstoff Salt = new Werkstoff(
            Materials.Salt.mRGBa,
            "Salt",
            new Werkstoff.Stats(),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().addGems().addSifterRecipes(),
            20,
            TextureSet.SET_FLINT,
            Arrays.asList(Materials.RockSalt, Materials.Borax),
            new Pair<>(Materials.Salt, 1)
    );
    public static final Werkstoff Spodumen = new Werkstoff(
            Materials.Spodumene.mRGBa,
            "Spodumene",
            new Werkstoff.Stats(),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().addGems().addSifterRecipes(),
            21,
            TextureSet.SET_FLINT,
            Collections.singletonList(Materials.Spodumene),
            new Pair<>(Materials.Spodumene, 1)
    );
    public static final Werkstoff RockSalt = new Werkstoff(
            Materials.RockSalt.mRGBa,
            "Rock Salt",
            new Werkstoff.Stats(),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().addGems().addSifterRecipes(),
            22,
            TextureSet.SET_FLINT,
            Arrays.asList(Materials.RockSalt, Materials.Borax),
            new Pair<>(Materials.RockSalt, 1)
    );

    //More NonGT Stuff
    public static final Werkstoff Fayalit = new Werkstoff(
            new short[]{50, 50, 50, 0},
            "Fayalite",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems(),
            23,
            TextureSet.SET_QUARTZ,
            Arrays.asList(Materials.Iron, Materials.Silicon),
            new Pair<>(Materials.Iron, 2),
            new Pair<>(Materials.Silicon, 1),
            new Pair<>(Materials.Oxygen, 4)
    );
    public static final Werkstoff Forsterit = new Werkstoff(
            new short[]{255, 255, 255, 0},
            "Forsterite",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems(),
            24,
            TextureSet.SET_QUARTZ,
            Arrays.asList(Materials.Magnesium, Materials.Silicon),
            new Pair<>(Materials.Magnesium, 2),
            new Pair<>(Materials.Silicon, 1),
            new Pair<>(Materials.Oxygen, 4)
    );
    public static final Werkstoff Hedenbergit = new Werkstoff(
            new short[]{100, 150, 100, 0},
            "Hedenbergite",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems(),
            25,
            TextureSet.SET_QUARTZ,
            Arrays.asList(Materials.Iron, Materials.Calcium, Materials.Silicon),
            new Pair<>(Materials.Calcium, 1),
            new Pair<>(Materials.Iron, 1),
            new Pair<>(Materials.Silicon, 2),
            new Pair<>(Materials.Oxygen, 6)
    );
    public static final Werkstoff DescloiziteZNVO4 = new Werkstoff(
            new short[]{0xBF, 0x18, 0x0F, 0},
            "Red Descloizite",//Pb(Zn,Cu)[OH|VO4
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            26,
            TextureSet.SET_QUARTZ,
            Arrays.asList(Materials.Lead, Materials.Copper, Materials.Vanadium),
            new Pair<>(Materials.Lead, 1),
            new Pair<>(Materials.Zinc, 1),
            new Pair<>(Materials.Vanadium, 1),
            new Pair<>(Materials.Oxygen, 4)
    );
    public static final Werkstoff DescloiziteCUVO4 = new Werkstoff(
            new short[]{0xf9, 0x6d, 0x18, 0},
            "Orange Descloizite",//Pb(Zn,Cu)[OH|VO4
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            27,
            TextureSet.SET_QUARTZ,
            Arrays.asList(Materials.Lead, Materials.Zinc, Materials.Vanadium),
            new Pair<>(Materials.Lead, 1),
            new Pair<>(Materials.Copper, 1),
            new Pair<>(Materials.Vanadium, 1),
            new Pair<>(Materials.Oxygen, 4)
    );
    public static final Werkstoff FuchsitAL = new Werkstoff(
            new short[]{0x4D, 0x7F, 0x64, 0},
            "Green Fuchsite",
            subscriptNumbers("KAl3Si3O10(OH)2"),
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            28,
            TextureSet.SET_METALLIC,
            Arrays.asList(Materials.Potassium, Materials.Aluminium, Materials.Silicon),
            new Pair<>(Materials.Potassium, 1),
            new Pair<>(Materials.Aluminium, 3),
            new Pair<>(Materials.Silicon, 3),
            new Pair<>(Materials.Oxygen, 12),
            new Pair<>(Materials.Hydrogen, 2)

    );
    public static final Werkstoff FuchsitCR = new Werkstoff(
            new short[]{128, 0, 0, 0},
            "Red Fuchsite",
            subscriptNumbers("KCr3Si3O10(OH)2"),
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            29,
            TextureSet.SET_METALLIC,
            Arrays.asList(Materials.Potassium, Materials.Chrome, Materials.Silicon),
            new Pair<>(Materials.Potassium, 1),
            new Pair<>(Materials.Chrome, 3),
            new Pair<>(Materials.Silicon, 3),
            new Pair<>(Materials.Oxygen, 12),
            new Pair<>(Materials.Hydrogen, 2)

    );
    public static final Werkstoff Thorium232 = new Werkstoff(
            new short[]{0, 64, 0, 0},
            "Thorium 232",
            superscriptNumbers("Th232"),
            new Werkstoff.Stats().setRadioactive(true),
            Werkstoff.Types.ISOTOPE,
            new Werkstoff.GenerationFeatures().disable().onlyDust().enforceUnification(),
            30,
            TextureSet.SET_METALLIC
            //No Byproducts
    );
    public static final Werkstoff BismuthTellurite = new Werkstoff(
            new short[]{32, 72, 32, 0},
            "Bismuth Tellurite",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addChemicalRecipes(),
            31,
            TextureSet.SET_METALLIC,
            //No Byproducts
            new Pair<>(Materials.Bismuth, 2),
            new Pair<>(Materials.Tellurium, 3)
    );
    public static final Werkstoff Tellurium = new Werkstoff(
            new short[]{0xff, 0xff, 0xff, 0},
            "Tellurium",
            new Werkstoff.Stats(),
            Werkstoff.Types.ELEMENT,
            new Werkstoff.GenerationFeatures().addMetalItems().removePrefix(ore),
            32,
            TextureSet.SET_METALLIC,
            //No Byproducts
            new Pair<>(Materials.Tellurium, 1)
    );
    public static final Werkstoff BismuthHydroBorat = new Werkstoff(
            new short[]{72, 144, 72, 0},
            "Dibismuthhydroborat",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addChemicalRecipes(),
            33,
            TextureSet.SET_METALLIC,
            //No Byproducts
            new Pair<>(Materials.Bismuth, 2),
            new Pair<>(Materials.Boron, 1),
            new Pair<>(Materials.Hydrogen, 1)
    );
    public static final Werkstoff ArInGaPhoBiBoTe = new Werkstoff(
            new short[]{36, 36, 36, 0},
            "Circuit Compound MK3",
            new Werkstoff.Stats().setCentrifuge(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addMixerRecipes(),
            34,
            TextureSet.SET_METALLIC,
            //No Byproducts
            new Pair<>(Materials.IndiumGalliumPhosphide, 1),
            new Pair<>(BismuthHydroBorat, 3),
            new Pair<>(BismuthTellurite, 2)
    );

    public static final Werkstoff Prasiolite = new Werkstoff(
            new short[]{0xD0, 0xDD, 0x95, 0},
            "Prasiolite",
            new Werkstoff.Stats().setElektrolysis(true).setMeltingPoint(1923),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems(),
            35,
            TextureSet.SET_QUARTZ,
            //No Byproducts
            new Pair<>(Materials.Silicon, 5),
            new Pair<>(Materials.Oxygen, 10),
            new Pair<>(Materials.Iron, 1)
    );

    public static final Werkstoff MagnetoResonaticDust = new Werkstoff(
            new short[]{0xDD, 0x77, 0xDD, 0},
            "Magneto Resonatic",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().onlyDust().addMixerRecipes().addGems(),
            36,
            TextureSet.SET_MAGNETIC,
            //No Byproducts
            new Pair<>(Prasiolite, 3),
            new Pair<>(BismuthTellurite, 4),
            new Pair<>(CubicZirconia, 1),
            new Pair<>(Materials.SteelMagnetic, 1)
    );
    public static final Werkstoff Xenon = new Werkstoff(
            new short[]{0x14, 0x39, 0x7F, 0},
            "Xenon",
            "Xe",
            new Werkstoff.Stats().setProtons(54).setMass(131).setGas(true),
            Werkstoff.Types.ELEMENT,
            new Werkstoff.GenerationFeatures().disable().addCells().enforceUnification(),
            37,
            TextureSet.SET_FLUID
            //No Byproducts
            //No Ingredients
    );
    public static final Werkstoff Oganesson = new Werkstoff(
            new short[]{0x14, 0x39, 0x7F, 0},
            "Oganesson",
            "Og",
            new Werkstoff.Stats().setProtons(118).setMass(294).setGas(true),
            Werkstoff.Types.ELEMENT,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            38,
            TextureSet.SET_FLUID
            //No Byproducts
            //No Ingredients
    );
    public static final Werkstoff Californium = new Werkstoff(
            new short[]{0xAA, 0xAA, 0xAA, 0},
            "Californium",
            "Cf",
            new Werkstoff.Stats().setProtons(98).setMass(251).setBlastFurnace(true).setMeltingPoint(900),
            Werkstoff.Types.ELEMENT,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addMetalItems().addMolten().enforceUnification(),
            39,
            TextureSet.SET_METALLIC
            //No Byproducts
            //No Ingredients
    );
    public static final Werkstoff Calcium = new Werkstoff(
            Materials.Calcium.mRGBa,
            "Calcium",
            "Ca",
            new Werkstoff.Stats().setProtons(Element.Ca.mProtons).setMass(Element.Ca.getMass()).setBlastFurnace(true).setMeltingPoint(1115).setBoilingPoint(1757),
            Werkstoff.Types.ELEMENT,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addMetalItems().addMolten(),
            40,
            Materials.Calcium.mIconSet,
            //No Byproducts
            new Pair<>(Materials.Calcium,1)
    );
    public static final Werkstoff Neon = new Werkstoff(
            new short[]{0xff, 0x07, 0x3a},
            "Neon",
            "Ne",
            new Werkstoff.Stats().setProtons(Element.Ne.mProtons).setMass(Element.Ne.getMass()).setGas(true),
            Werkstoff.Types.ELEMENT,
            new Werkstoff.GenerationFeatures().disable().addCells().enforceUnification(),
            41,
            TextureSet.SET_FLUID
            //No Byproducts
            //No Ingredients
    );
    public static final Werkstoff Krypton = new Werkstoff(
            new short[]{0xb1, 0xff, 0x32},
            "Krypton",
            "Kr",
            new Werkstoff.Stats().setProtons(Element.Kr.mProtons).setMass(Element.Kr.getMass()).setGas(true),
            Werkstoff.Types.ELEMENT,
            new Werkstoff.GenerationFeatures().disable().addCells().enforceUnification(),
            42,
            TextureSet.SET_FLUID
            //No Byproducts
            //No Ingredients
    );
    public static final Werkstoff BArTiMaEuSNeK = new Werkstoff(
            new short[]{0x00, 0xff, 0x00},
            "BArTiMaEuSNeK",
            "Are you serious?",
            new Werkstoff.Stats().setMeltingPoint(9001).setCentrifuge(true).setBlastFurnace(true).setMeltingVoltage(1920),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems().addMetalItems().addMolten(),
            43,
            TextureSet.SET_DIAMOND,
            Arrays.asList(
                    Materials.Boron,
                    Materials.Titanium,
                    Materials.Europium
                         ),
            new Pair<>(Materials.Boron, 1),
            new Pair<>(Materials.Argon, 1),
            new Pair<>(Materials.Titanium, 1),
            new Pair<>(Materials.Magic, 1),
            new Pair<>(Materials.Europium, 1),
            new Pair<>(Materials.Sulfur, 1),
            new Pair<>(Neon, 1),
            new Pair<>(Materials.Potassium, 1)
    );
    public static final Werkstoff PTConcentrate = new Werkstoff(
            Materials.Platinum.getRGBA(),
            "Platinum Concentrate",
            "",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            44,
            TextureSet.SET_FLUID
            //No Byproducts
            //No Ingredients
    );
    public static final Werkstoff PTSaltCrude = new Werkstoff(
            Materials.Platinum.getRGBA(),
            "Platinum Salt",
            "",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            45,
            TextureSet.SET_DULL
            //No Byproducts
            //No Ingredients
    );
    public static final Werkstoff PTSaltRefined = new Werkstoff(
            Materials.Platinum.getRGBA(),
            "Refined Platinum Salt",
            "",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            46,
            TextureSet.SET_METALLIC
            //No Byproducts
            //No Ingredients
    );
    public static final Werkstoff PTMetallicPowder = new Werkstoff(
            Materials.Platinum.getRGBA(),
            "Platinum Metallic Powder",
            "??PtPdIrOsRhRu??",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures(),
            47,
            TextureSet.SET_METALLIC,
            //No Byproducts
            new Pair<>(Materials.Platinum, 1),
            new Pair<>(Materials.Stone, 2)
    );
    public static final Werkstoff AquaRegia = new Werkstoff(
            new short[]{0xff, 0xb1, 0x32},
            "Aqua Regia",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            48,
            TextureSet.SET_FLUID,
            //No Byproducts
            new Pair<>(Materials.DilutedSulfuricAcid, 1),
            new Pair<>(Materials.NitricAcid, 1)
    );
    public static final Werkstoff PTResidue = new Werkstoff(
            new short[]{0x64, 0x63, 0x2E},
            "Platinum Residue",
            "??IrOsRhRu??",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            49,
            TextureSet.SET_ROUGH
            //No Byproducts
    );
    public static final Werkstoff AmmoniumChloride = new Werkstoff(
            new short[]{0xff, 0xff, 0xff},
            "Ammonium Chloride",
            subscriptNumbers("NH4Cl"),
            new Werkstoff.Stats(),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            50,
            TextureSet.SET_FLUID,
            //No Byproducts
            new Pair<>(Materials.Ammonium, 1),
            new Pair<>(Materials.HydrochloricAcid, 1)
    );
    public static final Werkstoff PTRawPowder = new Werkstoff(
            Materials.Platinum.getRGBA(),
            "Reprecipitated Platinum",
            "PtCl",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            51,
            TextureSet.SET_METALLIC
            //No Byproducts
    );
    public static final Werkstoff PDAmmonia = new Werkstoff(
            Materials.Palladium.getRGBA(),
            "Palladium Enriched Ammonia",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            52,
            TextureSet.SET_FLUID,
            //No Byproducts
            new Pair<>(Materials.Ammonium, 1),
            new Pair<>(Materials.Palladium, 1)
    );
    public static final Werkstoff PDMetallicPowder = new Werkstoff(
            Materials.Palladium.getRGBA(),
            "Palladium Metallic Powder",
            "??Pd??",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures(),
            53,
            TextureSet.SET_METALLIC,
            //No Byproducts
            new Pair<>(Materials.Palladium, 1),
            new Pair<>(Materials.Stone, 2)
    );
    public static final Werkstoff PDRawPowder = new Werkstoff(
            Materials.Palladium.getRGBA(),
            "Reprecipitated Palladium",
            subscriptNumbers("Pd2NH4"),
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            54,
            TextureSet.SET_METALLIC
            //No Byproducts
            //No Ingredients
    );
    public static final Werkstoff PDSalt = new Werkstoff(
            Materials.Palladium.getRGBA(),
            "Palladium Salt",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            55,
            TextureSet.SET_METALLIC
            //No Byproducts
            //No Ingredients
    );
    public static final Werkstoff Sodiumformate = new Werkstoff(
            new short[]{0xff, 0xaa, 0xaa},
            "Sodium Formate",
            "HCOONa",
            new Werkstoff.Stats(),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            56,
            TextureSet.SET_FLUID,
            //No Byproducts
            new Pair<>(Materials.SodiumHydroxide, 1),
            new Pair<>(Materials.CarbonMonoxide, 1)
    );
    public static final Werkstoff Sodiumsulfate = new Werkstoff(
            new short[]{0xff, 0xff, 0xff},
            "Sodium Sulfate",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            57,
            TextureSet.SET_FLUID,
            //No Byproducts
            new Pair<>(Materials.Sodium, 2),
            new Pair<>(Materials.Sulfur, 1),
            new Pair<>(Materials.Oxygen, 4)
    );
    public static final Werkstoff FormicAcid = new Werkstoff(
            new short[]{0xff, 0xaa, 0x77},
            "Formic Acid",
            subscriptNumbers("CH2O2"),
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            58,
            TextureSet.SET_FLUID,
            //No Byproducts
            new Pair<>(Materials.Carbon, 1),
            new Pair<>(Materials.Hydrogen, 2),
            new Pair<>(Materials.Oxygen, 2)
    );
    public static final Werkstoff PotassiumDisulfate = new Werkstoff(
            new short[]{0xfb, 0xbb, 0x66},
            "Potassium Disulfate",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addMolten().addChemicalRecipes(),
            59,
            TextureSet.SET_DULL,
            //No Byproducts
            new Pair<>(Materials.Potassium, 2),
            new Pair<>(Materials.Sulfur, 2),
            new Pair<>(Materials.Oxygen, 7)
    );
    public static final Werkstoff LeachResidue = new Werkstoff(
            new short[]{0x64, 0x46, 0x29},
            "Leach Residue",
            "??IrOsRu??",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures(),
            60,
            TextureSet.SET_ROUGH
            //No Byproducts
    );
    public static final Werkstoff RHSulfate = new Werkstoff(
            new short[]{0xee, 0xaa, 0x55},
            "Rhodium Sulfate",
            new Werkstoff.Stats().setGas(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            61,
            TextureSet.SET_FLUID
            //No Byproducts
    );
    public static final Werkstoff RHSulfateSolution = new Werkstoff(
            new short[]{0xff, 0xbb, 0x66},
            "Rhodium Sulfate Solution",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            62,
            TextureSet.SET_FLUID
            //No Byproducts
    );
    public static final Werkstoff CalciumChloride = new Werkstoff(
            new short[]{0xff, 0xff, 0xff},
            "Calcium Chloride",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addCells(),
            63,
            TextureSet.SET_DULL,
            new Pair<>(Materials.Calcium, 1),
            new Pair<>(Materials.Chlorine, 2)
            //No Byproducts
    );
    public static final Werkstoff Ruthenium = new Werkstoff(
            new short[]{0x64, 0x64, 0x64},
            "Ruthenium",
            "Ru",
            new Werkstoff.Stats().setBlastFurnace(true).setMeltingPoint(2607).setMass(Element.Ru.getMass()).setProtons(Element.Ru.mProtons),
            Werkstoff.Types.ELEMENT,
            new Werkstoff.GenerationFeatures().onlyDust().addMolten().addMetalItems().enforceUnification(),
            64,
            TextureSet.SET_METALLIC
            //No Byproducts
    );
    public static final Werkstoff SodiumRuthenate = new Werkstoff(
            new short[]{0x3a, 0x40, 0xcb},
            "Sodium Ruthenate",
            new Werkstoff.Stats(),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            65,
            TextureSet.SET_SHINY,
            new Pair<>(Materials.Sodium, 2),
            new Pair<>(Ruthenium, 1),
            new Pair<>(Materials.Oxygen, 3)
            //No Byproducts
    );
    public static final Werkstoff RutheniumTetroxide = new Werkstoff(
            new short[]{0xc7, 0xc7, 0xc7},
            "Ruthenium Tetroxide",
            new Werkstoff.Stats().setMeltingPoint(313),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addCells(),
            66,
            TextureSet.SET_DULL,
            new Pair<>(Ruthenium, 1),
            new Pair<>(Materials.Oxygen, 4)
            //No Byproducts
    );
    public static final Werkstoff HotRutheniumTetroxideSollution = new Werkstoff(
            new short[]{0xc7, 0xc7, 0xc7},
            "Hot Ruthenium Tetroxide Solution",
            "???",
            new Werkstoff.Stats().setGas(true).setMeltingPoint(700),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            67,
            TextureSet.SET_FLUID,
            new Pair<>(Ruthenium, 1),
            new Pair<>(Materials.Oxygen, 4),
            new Pair<>(Materials.Chlorine, 2),
            new Pair<>(Materials.Sodium, 2),
            new Pair<>(Materials.Water, 2)
            //No Byproducts
    );
    public static final Werkstoff RutheniumTetroxideSollution = new Werkstoff(
            new short[]{0xc7, 0xc7, 0xc7},
            "Ruthenium Tetroxide Solution",
            "???",
            new Werkstoff.Stats().setMeltingPoint(313),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            68,
            TextureSet.SET_FLUID,
            new Pair<>(Ruthenium, 1),
            new Pair<>(Materials.Oxygen, 4),
            new Pair<>(Materials.Chlorine, 2),
            new Pair<>(Materials.Sodium, 2),
            new Pair<>(Materials.Water, 2)
            //No Byproducts
    );
    public static final Werkstoff IrOsLeachResidue = new Werkstoff(
            new short[]{0x64, 0x46, 0x29},
            "Rarest Metal Residue",
            "??OsIr??",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures(),
            69,
            TextureSet.SET_ROUGH,
            //No Byproducts
            new Pair<>(Materials.Osmiridium, 1),
            new Pair<>(Materials.Stone, 2)
    );
    public static final Werkstoff IrLeachResidue = new Werkstoff(
            new short[]{0x84, 0x66, 0x49},
            "Iridium Metal Residue",
            "??Ir??",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures(),
            70,
            TextureSet.SET_ROUGH,
            new Pair<>(Materials.Iridium, 1),
            new Pair<>(Materials.Stone, 2)
            //No Byproducts
    );
    public static final Werkstoff PGSDResidue = new Werkstoff(
            new short[]{0x84, 0x66, 0x49},
            "Sludge Dust Residue",
            new Werkstoff.Stats().setCentrifuge(true),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            71,
            TextureSet.SET_DULL,
            new Pair<>(Materials.SiliconDioxide, 3),
            new Pair<>(Materials.Gold, 2)
    );
    public static final Werkstoff AcidicOsmiumSolution = new Werkstoff(
            new short[]{0x84, 0x66, 0x49},
            "Acidic Osmium Solution",
            "???",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            72,
            TextureSet.SET_FLUID,
            new Pair<>(Materials.Osmium, 1),
            new Pair<>(Materials.HydrochloricAcid, 1)
    );
    public static final Werkstoff IridiumDioxide = new Werkstoff(
            new short[]{0x84, 0x66, 0x49},
            "Iridium Dioxide",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            73,
            TextureSet.SET_FLUID,
            new Pair<>(Materials.Iridium, 1),
            new Pair<>(Materials.Oxygen, 2)
    );
    public static final Werkstoff OsmiumSolution = new Werkstoff(
            new short[]{0x84, 0x66, 0x49},
            "Osmium Solution",
            "???",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            74,
            TextureSet.SET_FLUID,
            new Pair<>(Materials.Osmium, 1),
            new Pair<>(Materials.Hydrogen, 1)
    );
    public static final Werkstoff AcidicIridiumSolution = new Werkstoff(
            new short[]{0x84, 0x66, 0x49},
            "Acidic Iridium Solution",
            "???",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            75,
            TextureSet.SET_FLUID,
            new Pair<>(Materials.Iridium, 1),
            new Pair<>(Materials.Hydrogen, 1)
    );
    public static final Werkstoff IridiumChloride = new Werkstoff(
            new short[]{0x84, 0x66, 0x49},
            "Iridium Chloride",
            subscriptNumbers("IrCl3"),
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            76,
            TextureSet.SET_LAPIS,
            new Pair<>(Materials.Iridium, 1),
            new Pair<>(Materials.Chlorine, 3)
    );
    public static final Werkstoff PGSDResidue2 = new Werkstoff(
            new short[]{0x84, 0x66, 0x49},
            "Metallic Sludge Dust Residue",
            new Werkstoff.Stats().setCentrifuge(true),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            77,
            TextureSet.SET_DULL,
            new Pair<>(Materials.Nickel, 1),
            new Pair<>(Materials.Copper, 1)
    );
    public static final Werkstoff Rhodium = new Werkstoff(
            new short[]{0xF4, 0xF4, 0xF4},
            "Rhodium",
            "Rh",
            new Werkstoff.Stats().setProtons(Element.Rh.mProtons).setMass(Element.Rh.getMass()).setBlastFurnace(true).setMeltingPoint(2237),
            Werkstoff.Types.ELEMENT,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addMetalItems().addMolten().enforceUnification(),
            78,
            TextureSet.SET_METALLIC
    );
    public static final Werkstoff CrudeRhMetall = new Werkstoff(
            new short[]{0x66, 0x66, 0x66},
            "Crude Rhodium Metal",
            "??Rh??",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures(),
            79,
            TextureSet.SET_DULL,
            new Pair<>(Rhodium, 1),
            new Pair<>(Materials.Stone, 1)
    );
    public static final Werkstoff RHSalt = new Werkstoff(
            new short[]{0x84, 0x84, 0x84},
            "Rhodium Salt",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            80,
            TextureSet.SET_GEM_VERTICAL
    );
    public static final Werkstoff RHSaltSolution = new Werkstoff(
            new short[]{0x66, 0x77, 0x88},
            "Rhodium Salt Solution",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            81,
            TextureSet.SET_FLUID
    );
    public static final Werkstoff SodiumNitrate = new Werkstoff(
            new short[]{0x84, 0x66, 0x84},
            "Sodium Nitrate",
            subscriptNumbers("NaNO3"),
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addChemicalRecipes(),
            82,
            TextureSet.SET_ROUGH,
            new Pair<>(Materials.Sodium, 1),
            new Pair<>(Materials.NitricAcid, 1)
    );
    public static final Werkstoff RHNitrate = new Werkstoff(
            new short[]{0x77, 0x66, 0x49},
            "Rhodium Nitrate",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            83,
            TextureSet.SET_QUARTZ
    );
    public static final Werkstoff ZincSulfate = new Werkstoff(
            new short[]{0x84, 0x66, 0x49},
            "Zinc Sulfate",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            84,
            TextureSet.SET_QUARTZ,
            new Pair<>(Materials.Zinc, 1),
            new Pair<>(Materials.Sulfur, 1),
            new Pair<>(Materials.Oxygen, 4)
    );
    public static final Werkstoff RhFilterCake = new Werkstoff(
            new short[]{0x77, 0x66, 0x49},
            "Rhodium Filter Cake",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            85,
            TextureSet.SET_QUARTZ
    );
    public static final Werkstoff RHFilterCakeSolution = new Werkstoff(
            new short[]{0x66, 0x77, 0x88},
            "Rhodium Filter Cake Solution",
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().addCells(),
            86,
            TextureSet.SET_FLUID
    );
    public static final Werkstoff ReRh = new Werkstoff(
            new short[]{0x77, 0x66, 0x49},
            "Reprecipitated Rhodium",
            subscriptNumbers("Rh2NH4"),
            new Werkstoff.Stats(),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust(),
            87,
            TextureSet.SET_QUARTZ
    );
    public static final Werkstoff LuVTierMaterial = new Werkstoff(
            Materials.Chrome.getRGBA(),
            "Rhodium-Plated Palladium",
            new Werkstoff.Stats().setCentrifuge(true).setBlastFurnace(true).setMeltingPoint(4500).setMeltingVoltage(480),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addMolten().addMetalItems().addMixerRecipes().addSimpleMetalWorkingItems().addCraftingMetalWorkingItems().addMultipleIngotMetalWorkingItems(),
            88,
            TextureSet.SET_METALLIC,
            new Pair<>(Materials.Palladium, 3),
            new Pair<>(Rhodium, 1)
    );
    public static final Werkstoff Tiberium = new Werkstoff(
            new short[]{0x22, 0xEE, 0x22},
            "Tiberium",
            "Tr",
            new Werkstoff.Stats().setProtons(123).setMass(326).setBlastFurnace(true).setMeltingPoint(1800).setRadioactive(true).setToxic(true),
            Werkstoff.Types.ELEMENT,
            new Werkstoff.GenerationFeatures().addGems().addCraftingMetalWorkingItems().addSimpleMetalWorkingItems(),
            89,
            TextureSet.SET_DIAMOND
    );
    public static final Werkstoff Ruridit = new Werkstoff(
            new short[]{0xA4, 0xA4, 0xA4},
            "Ruridit",
            new Werkstoff.Stats().setCentrifuge(true).setBlastFurnace(true).setMeltingPoint(4500).setMeltingVoltage(480),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addMolten().addMetalItems().addMixerRecipes().addSimpleMetalWorkingItems().addCraftingMetalWorkingItems().addMultipleIngotMetalWorkingItems(),
            90,
            TextureSet.SET_METALLIC,
            new Pair<>(Ruthenium, 2),
            new Pair<>(Materials.Iridium, 1)
    );
    public static final Werkstoff Fluorspar = new Werkstoff(
            new short[]{185, 69, 251},
            "Fluorspar",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures().addGems(),
            91,
            TextureSet.SET_GEM_VERTICAL,
            new Pair<>(Materials.Calcium, 1),
            new Pair<>(Materials.Fluorine, 2)
    );
    public static final Werkstoff HDCS = new Werkstoff(
            new short[]{0x33, 0x44, 0x33},
            "High Durability Compound Steel",
            new Werkstoff.Stats().setCentrifuge(true).setBlastFurnace(true).setMeltingPoint(9000).setMeltingVoltage(7680),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().disable().onlyDust().addMolten().addMetalItems().addMixerRecipes().addSimpleMetalWorkingItems().addCraftingMetalWorkingItems().addMultipleIngotMetalWorkingItems(),
            92,
            TextureSet.SET_SHINY,
            new Pair<>(Materials.TungstenSteel, 12),
            new Pair<>(Materials.HSSE, 9),
            new Pair<>(Materials.HSSG, 6),
            new Pair<>(Ruridit, 3),
            new Pair<>(MagnetoResonaticDust, 2),
            new Pair<>(Materials.Plutonium, 1)
    );
    public static final Werkstoff Atheneite = new Werkstoff(
            new short[]{175, 175, 175},
            "Atheneite",
            subscriptNumbers("(Pd,Hg)3As"),
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            93,
            TextureSet.SET_SHINY,
            new Pair<>(PDMetallicPowder, 3),
            new Pair<>(Materials.Mercury, 3),
            new Pair<>(Materials.Arsenic, 1)
    );
    public static final Werkstoff Temagamite = new Werkstoff(
            new short[]{245, 245, 245},
            "Temagamite",
            subscriptNumbers("Pd3HgTe"),
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            94,
            TextureSet.SET_ROUGH,
            new Pair<>(PDMetallicPowder, 3),
            new Pair<>(Materials.Mercury, 1),
            new Pair<>(Materials.Tellurium, 1)
    );
    public static final Werkstoff Terlinguaite = new Werkstoff(
            new short[]{245, 245, 245},
            "Terlinguaite",
            new Werkstoff.Stats().setElektrolysis(true),
            Werkstoff.Types.COMPOUND,
            new Werkstoff.GenerationFeatures(),
            95,
            TextureSet.SET_GEM_HORIZONTAL,
            new Pair<>(Materials.Mercury, 2),
            new Pair<>(Materials.Chlorine, 1),
            new Pair<>(Materials.Oxygen, 1)
    );
    public static final Werkstoff AdemicSteel = new Werkstoff(
            new short[]{0xcc, 0xcc, 0xcc},
            "Ademic Steel",
            "The break in the line",
            new Werkstoff.Stats().setCentrifuge(true).setBlastFurnace(true).setDurOverride(6144).setMeltingPoint(1800).setSpeedOverride(12).setQualityOverride((byte) 4).setMeltingVoltage(1920),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().onlyDust().addMetalItems().addCraftingMetalWorkingItems().addMolten().addSimpleMetalWorkingItems().addMultipleIngotMetalWorkingItems(),
            96,
            TextureSet.SET_METALLIC,
            new Pair<>(Materials.Steel, 2),
            new Pair<>(Materials.VanadiumSteel, 1),
            new Pair<>(Materials.DamascusSteel, 1),
            new Pair<>(Materials.Carbon, 4)
    );
    public static final Werkstoff RawAdemicSteel = new Werkstoff(
            new short[]{0xed, 0xed, 0xed},
            "Raw Ademic Steel",
            new Werkstoff.Stats().setCentrifuge(true),
            Werkstoff.Types.MIXTURE,
            new Werkstoff.GenerationFeatures().onlyDust().addMixerRecipes(),
            97,
            TextureSet.SET_ROUGH,
            new Pair<>(Materials.Steel, 2),
            new Pair<>(Materials.VanadiumSteel, 1),
            new Pair<>(Materials.DamascusSteel, 1)
    );
    
    public static void init() {
        if (!gtnhGT) {
            HDCS.getGenerationFeatures().extraRecipes ^= 10;
        }
        addSubTags();
    }

    private static void addSubTags() {
        CubicZirconia.getStats().setDurOverride(Materials.Diamond.mDurability);
        HDCS.getStats().setSpeedOverride(Materials.HSSS.mToolSpeed);
        HDCS.getStats().setDurMod(10f);
        Materials.Helium.add(NOBLE_GAS);
        Neon.add(NOBLE_GAS);
        Materials.Argon.add(NOBLE_GAS);
        Krypton.add(NOBLE_GAS);
        Xenon.add(NOBLE_GAS, ANAEROBE_GAS);
        Materials.Radon.add(NOBLE_GAS);
        Oganesson.add(NOBLE_GAS, ANAEROBE_GAS);

        Materials.Nitrogen.add(ANAEROBE_GAS);

        Calcium.add(ANAEROBE_SMELTING);

        LuVTierMaterial.add(NOBLE_GAS_SMELTING);
        Ruridit.add(NOBLE_GAS_SMELTING);
        AdemicSteel.add(NOBLE_GAS_SMELTING);

        MagnetoResonaticDust.add(NO_BLAST);

        //Calcium Smelting block
        Materials.Calcium.mBlastFurnaceRequired = true;

        Materials.Salt.mDurability = Salt.getDurability();
        Materials.Spodumene.mDurability = Spodumen.getDurability();
        Materials.RockSalt.mDurability = RockSalt.getDurability();
        Materials.Calcium.mDurability = Calcium.getDurability();

        Materials.Salt.mToolSpeed = Salt.getToolSpeed();
        Materials.Spodumene.mToolSpeed = Spodumen.getToolSpeed();
        Materials.RockSalt.mToolSpeed = RockSalt.getToolSpeed();
        Materials.Calcium.mToolSpeed = Calcium.getToolSpeed();

        Materials.Salt.mToolQuality = Salt.getToolQuality();
        Materials.Spodumene.mToolQuality = Spodumen.getToolQuality();
        Materials.RockSalt.mToolQuality = RockSalt.getToolQuality();
        Materials.Calcium.mToolQuality = Calcium.getToolQuality();

        for (Werkstoff W : Werkstoff.werkstoffHashSet) {
            for (Pair<ISubTagContainer, Integer> pair : W.getContents().getValue().toArray(new Pair[0])) {

                if (pair.getKey() instanceof Materials && pair.getKey() == Materials.Neodymium) {
                    W.add(SubTag.ELECTROMAGNETIC_SEPERATION_NEODYMIUM);
                    break;
                } else if (pair.getKey() instanceof Materials && pair.getKey() == Materials.Iron) {
                    W.add(SubTag.ELECTROMAGNETIC_SEPERATION_IRON);
                    break;
                } else if (pair.getKey() instanceof Materials && pair.getKey() == Materials.Gold) {
                    W.add(SubTag.ELECTROMAGNETIC_SEPERATION_GOLD);
                    break;
                }
            }
            if (W.hasItemType(gem)) {
                W.add(SubTag.CRYSTAL);
                W.add(SubTag.CRYSTALLISABLE);
            }
        }
    }

    public static void cubicZiconiaIndustrialDiamond() {
        GT_OreDictUnificator.registerOre("craftingIndustrialDiamond", CubicZirconia.get(gemExquisite));

    }
}
