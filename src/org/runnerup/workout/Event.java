/*
 * Copyright (C) 2012 jonas.oreland@gmail.com
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.runnerup.workout;

import org.runnerup.R;

/**
 * This is just constant
 */
public enum Event {

	STARTED(1,R.string.started),
	PAUSED(2, R.string.paused),
	STOPPED(3, R.string.stopped),
	RESUMED(4, R.string.resumed),
	COMPLETED(5, R.string.completed);

	int value = 0;
	int cueId;
	
	private Event(int val, int cueId) {
		this.value = val;
		this.cueId = cueId;
	}

	/**
	 * @return the eventValue
	 */
	public int getValue() {
		return value;
	}

	public boolean equal(Event what) {
		if (what == null || what.value != this.value)
			return false;
		return true;
	}

	public int getCueId() {
		return cueId;
	}
}
