/*
 * LightProxy
 * Copyright (C) 2021.  VenixPLL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package pl.venixpll.mc.data.chat;

import java.util.Objects;

public class ClickEvent implements Cloneable {
    private ClickAction action;
    private String value;

    public ClickEvent(ClickAction action, String value) {
        this.action = action;
        this.value = value;
    }

    public ClickAction getAction() {
        return this.action;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public ClickEvent clone() {
        return new ClickEvent(this.action, this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClickEvent)) return false;

        ClickEvent that = (ClickEvent) o;
        return this.action == that.action &&
                Objects.equals(this.value, that.value);
    }
}
