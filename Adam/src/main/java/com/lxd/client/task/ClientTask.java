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

package com.lxd.client.task;
import com.lxd.task.Task;

import io.netty.channel.Channel;

/**
 * 客户端任务的基类
 * 
 * @author: a5834099147
 * @mailto: a5834099147@126.com
 * @date: 2014年12月17日
 * @blog : http://a5834099147.github.io/
 * @review
 */
public abstract class ClientTask implements Task {

    // /< 任务的发送通道
    private Channel channel;
    // /< 任务的编号
    private long    jobId = 0;

    public long getJobId() {
        return jobId;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public Channel getChannel() {
        return channel;
    }

    // /< 任务的具体流程
    @Override
    public abstract void execute();
}
