package eu.crushedpixel.littlstar.api.data.upload;

import eu.crushedpixel.littlstar.api.data.ApiSend;
import eu.crushedpixel.littlstar.api.data.resource.ResourceVisibility;
import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * Copyright 2015 Marius Metzger - http://crushedpixel.eu
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

public class UpdateUpload {

    @Data
    @AllArgsConstructor
    public static class UpdateUploadSend implements ApiSend {
        private String title;
        private String description;
        private ResourceVisibility visibility;
        private boolean download;
        private int[] category_ids;

        @Override
        public String getKey() {
            return "upload";
        }
    }

    //receives UploadData

}
