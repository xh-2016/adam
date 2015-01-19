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

package com.lxd.client.service;

import java.util.List;

import com.lxd.client.entity.File;


/**
 * 文件业务接口
 * @author: a5834099147
 * @mailto: a5834099147@126.com
 * @date: 2015年1月8日
 * @blog : http://a5834099147.github.io/
 * @review 
 */
public interface FileServer {
    ///< 新增文件
    void addFile(File file);
    ///< 删除文件
    void deleteFile(File file);
    ///< 修改文件
    void updateFile(File file);
    ///< 查找文件
    List<File> searchFile(String user_name);
    ///< 删除硬盘文件
    void deleteHDDFile(String path);
    ///< 更名硬盘文件
    java.io.File renameHddFile(String path);
}
