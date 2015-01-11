package backup.data;

/**
 *  Copyright (c) 2015 Jes�s Mart�n Berlanga. All rights reserved.
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
 *  @author Jes�s Mart�n Berlanga
 */
public class Im implements Param{

	private String id;
	private User user;
	
	public Im(String id, User user) {
		this.id = id;
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public User getUser() {
		return user;
	}
	
	@Override
	public String toString() {
		return "channel=".concat(id);
	}
}
