package backup.data;

import java.io.IOException;

/**
 *  Copyright (c) 2015  Berlanga. All rights reserved.
 *  SlackBackup is licensed under GNU General Public License (GPLv3)
 *  
 *  This file is part of SlackBackup.
 *
 *  SlackBackup is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  SlackBackup is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with SlackBackup.  If not, see <http://www.gnu.org/licenses/>.
 *  
 *  @author  Berlanga
 */
public class GroupList extends ChatRoomList {

	public GroupList(Token token) throws IOException {
		super(token);
	}

	@Override
	public Methods getUsedMethod() {
		return Methods.GROUPS_LIST;
	}

	@Override
	public String getUsedArray() {
		return "groups";
	}
		
}
