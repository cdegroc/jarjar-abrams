/**
 * Copyright 2007 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.eed3si9n.jarjar;

import java.io.IOException;

public interface DepHandler
{
    public static final int LEVEL_CLASS = 0;
    public static final int LEVEL_JAR = 1;

    void handleStart() throws IOException;
    void handle(PathClass from, PathClass to) throws IOException;
    void handleEnd() throws IOException;
}