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

package com.lxd.client.handle.impl;

import com.lxd.client.entity.File;
import com.lxd.client.handle.console.UpdateFileHandle;
import com.lxd.client.resource.property.ServerUpdateFile;
import com.lxd.client.service.FileServer;
import com.lxd.client.service.impl.FileServerImpl;
import com.lxd.client.view.control.UiSingleton;
import com.lxd.resource.Resource;
import com.lxd.utils.Grnerate;


/**
 * 更新文件结果处理
 * @author: a5834099147
 * @mailto: a5834099147@126.com
 * @date: 2015年1月8日
 * @blog : http://a5834099147.github.io/
 * @review 
 */
public class UpdateFileImpl implements UpdateFileHandle {
    
    private FileServer fileServer = new FileServerImpl();

    @Override
    public void updateFileSuccess(Long id) {
        ///< 得到任务信息
        ServerUpdateFile pro =  (ServerUpdateFile) Resource.getSingleton().getJobStatus().getProperty(id);
        
        ///< 添加文件
        File file = new File();
        file.setLast(pro.getLast());
        file.setLength(pro.getLength());
        file.setMd5(pro.getMd5());
        file.setUser_name(UiSingleton.getSingleton().getUser());
        file.setPath(Grnerate.getClientPath(pro.getPath()));
        file.setEdition(pro.getEdition());
        
        ///< 保存新增文件记录
        fileServer.updateFile(file);        
    }

    @Override
    public void updateFileError(Long id, String msg) {
    }

}
