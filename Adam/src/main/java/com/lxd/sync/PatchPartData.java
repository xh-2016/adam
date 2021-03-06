/*
 * Copyright (C) 2014 a5834099147(lxd) <a5834099147@126.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.lxd.sync;

import java.util.List;

/**
 * 补丁文件序列
 * @author: a5834099147
 * @mailto: a5834099147@126.com
 * @date: 2014年12月25日
 * @blog : http://a5834099147.github.io/
 * @review 
 */
public class PatchPartData extends PatchPart{
	private byte[] datas;
	
	public PatchPartData(List<Byte> datas){
		this.datas = new byte[datas.size()];
		for(int i = 0 ; i < datas.size() ; i++){
			this.datas[i] = datas.get(i);
		}
	}	

	public PatchPartData(byte[] datas){
        super();
        this.datas = datas;
    }
	
    public byte[] getDatas() {
		return datas;
	}

	public void setDatas(byte[] datas) {
		this.datas = datas;
	}	
}
