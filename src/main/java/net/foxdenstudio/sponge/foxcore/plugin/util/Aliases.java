/*
 * This file is part of FoxCore, licensed under the MIT License (MIT).
 *
 * Copyright (c) gravityfox - https://gravityfox.net/
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package net.foxdenstudio.sponge.foxcore.plugin.util;

import org.spongepowered.api.util.Tristate;

public final class Aliases {

    public static final String[] WORLD_ALIASES = {"world", "w", "dimension", "d"};
    public static final String[] REGIONS_ALIASES = {"regions", "region", "reg", "rg", "r"};
    public static final String[] WORLDREGIONS_ALIASES = {"worldregions","wregions", "worldregion", "wregion", "worldreg", "wreg", "worldrg", "wrg", "worldr", "wr"};
    public static final String[] HANDLERS_ALIASES = {"handlers", "handler", "handles", "handle", "hands", "hand", "hn", "h", "flagsets", "flagset", "flags", "flag", "f"};
    public static final String[] CONTROLLERS_ALIASES = {"controllers", "controller", "controls", "control", "switch", "con", "c"};
    public static final String[] POSITIONS_ALIASES = {"positions", "position", "points", "point", "locations", "location", "pos", "loc", "locs", "p"};
    public static final String[] OWNER_GROUP_ALIASES = {"owners", "owner", "masters", "master", "creators", "creator",
            "admins", "admin", "administrators", "administrator", "mods", "mod"};
    public static final String[] MEMBER_GROUP_ALIASES = {"members", "member", "users", "user", "players", "player"};
    public static final String[] DEFAULT_GROUP_ALIASES = {"default", "nonmember", "nonmembers", "everyone", "other"};
    public static final String[] SET_ALIASES = {"set", "perm", "flag", "rule", "perms", "flags", "rules", "permission", "permissions"};
    public static final String[] PASSIVE_ALIASES = {"passive", "causeless", "userless", "environment"};
    public static final String[] GROUPS_ALIASES = {"group", "groups"};
    public static final String[] TRUE_ALIASES = {"true", "t", "allow", "a"};
    public static final String[] FALSE_ALIASES = {"false", "f", "deny", "d"};
    public static final String[] PASSTHROUGH_ALIASES = {"passthrough", "pass", "p", "undefined", "undef", "un", "u"};
    public static final String[] CLEAR_ALIASES = {"clear", "erase", "reset", "remove", "default", "original"};
    public static final String[] PLAYER_ALIASES = {"player", "user", "username", "p", "u"};
    public static final String[] ALL_ALIASES = {"all", "a", "everything"};

    public static boolean isIn(String[] aliases, String input) {
        if(input == null || input.isEmpty()) return false;
        for (String alias : aliases) {
            if (alias.equalsIgnoreCase(input)) return true;
        }
        return false;
    }

    public static Tristate tristateFrom(String name) {
        if (isIn(TRUE_ALIASES, name)) {
            return Tristate.TRUE;
        } else if (isIn(FALSE_ALIASES, name)) {
            return Tristate.FALSE;
        } else if (isIn(PASSTHROUGH_ALIASES, name)) {
            return Tristate.UNDEFINED;
        } else {
            return null;
        }
    }
}
