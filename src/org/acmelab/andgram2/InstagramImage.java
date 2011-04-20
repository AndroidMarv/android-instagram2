/*
 * Copyright 2011, Mark L. Chang <mark.chang@gmail.com>. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other
 *       materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY Mark L. Chang ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL MARK L. CHANG OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of Mark L. Chang.
 */

package org.acmelab.andgram2;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: mchang
 * Date: 3/25/11
 * Time: 11:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class InstagramImage {
    public String thumbnail;
    public String low_resolution;
    public String standard_resolution;
    public String permalink;
    public String username;
    public String user_id;
    public String full_name = "";
    public String caption = "";
    public String taken_at;
    public Long taken_time;
    public String id;

    public boolean user_has_liked;

    public int liker_count;
    public int comment_count;

    public ArrayList<String> liker_list;
    public ArrayList<Comment> comment_list;
}
