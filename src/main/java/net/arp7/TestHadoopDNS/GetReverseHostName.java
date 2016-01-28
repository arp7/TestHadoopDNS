/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.arp7.TestHadoopDNS;

import java.net.UnknownHostException;
import org.apache.hadoop.net.DNS;

public class GetReverseHostName {
  public static void main(String[] argv) throws UnknownHostException {
    if (argv.length != 1) {
      System.err.println("  Usage: GetReverseHostName <interface-name>");
      System.exit(1);
    }

    final String hostname = DNS.getDefaultHost(argv[0], "default");
    // final String hostname = DNS.getDefaultHost(argv[0], "default", true);  -- Enable for 2.8.0 or later.
    System.out.println(" >> Mapped " + argv[0] + " to hostname " + hostname);
  }
}
