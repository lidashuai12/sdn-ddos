cd /home/mao/Mao/Documents/Mininet_packets || exit
echo "mao" | sudo -S python2 mininetTest.py
sleep 50
xterm h1
ping 10.0.0.0


NXST_FLOW reply (xid=0x4):
 cookie=0x0, duration=4221.593s, table=0, n_packets=0, n_bytes=0, idle_age=4221, priority=2,ip,in_port=1,dl_src=d2:bd:d7:55:fe:91,dl_dst=ea:5b:03:b6:13:be,nw_src=10.0.0.4,nw_dst=10.0.0.9 actions=output:4
 cookie=0x0, duration=4177.470s, table=0, n_packets=1, n_bytes=98, idle_age=4049, priority=2,ip,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=e6:f9:5c:67:99:b9,nw_src=10.0.0.9,nw_dst=10.0.0.10 actions=output:3
 cookie=0x0, duration=4167.486s, table=0, n_packets=1, n_bytes=98, idle_age=3930, priority=2,ip,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=32:f7:65:6e:51:3a,nw_src=10.0.0.9,nw_dst=10.0.0.11 actions=output:2
 cookie=0x0, duration=4153.377s, table=0, n_packets=1, n_bytes=98, idle_age=3738, priority=2,ip,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=32:31:98:86:f1:16,nw_src=10.0.0.9,nw_dst=10.0.0.13 actions=output:1
 cookie=0x0, duration=4143.356s, table=0, n_packets=1, n_bytes=98, idle_age=3612, priority=2,ip,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=0a:42:a7:b7:01:17,nw_src=10.0.0.9,nw_dst=10.0.0.14 actions=output:1
 cookie=0x0, duration=4134.402s, table=0, n_packets=1, n_bytes=98, idle_age=3486, priority=2,ip,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=02:4b:98:a2:72:3b,nw_src=10.0.0.9,nw_dst=10.0.0.15 actions=output:5
 cookie=0x0, duration=4092.327s, table=0, n_packets=0, n_bytes=0, idle_age=4092, priority=2,ip,in_port=1,dl_src=d2:bd:d7:55:fe:91,dl_dst=e6:f9:5c:67:99:b9,nw_src=10.0.0.4,nw_dst=10.0.0.10 actions=output:3
 cookie=0x0, duration=4048.259s, table=0, n_packets=1, n_bytes=98, idle_age=3930, priority=2,ip,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=32:f7:65:6e:51:3a,nw_src=10.0.0.10,nw_dst=10.0.0.11 actions=output:2
 cookie=0x0, duration=4034.146s, table=0, n_packets=1, n_bytes=98, idle_age=3728, priority=2,ip,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=32:31:98:86:f1:16,nw_src=10.0.0.10,nw_dst=10.0.0.13 actions=output:1
 cookie=0x0, duration=4024.154s, table=0, n_packets=1, n_bytes=98, idle_age=3602, priority=2,ip,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=0a:42:a7:b7:01:17,nw_src=10.0.0.10,nw_dst=10.0.0.14 actions=output:1
 cookie=0x0, duration=4015.167s, table=0, n_packets=1, n_bytes=98, idle_age=3486, priority=2,ip,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=02:4b:98:a2:72:3b,nw_src=10.0.0.10,nw_dst=10.0.0.15 actions=output:5
 cookie=0x0, duration=3973.100s, table=0, n_packets=0, n_bytes=0, idle_age=3973, priority=2,ip,in_port=1,dl_src=d2:bd:d7:55:fe:91,dl_dst=32:f7:65:6e:51:3a,nw_src=10.0.0.4,nw_dst=10.0.0.11 actions=output:2
 cookie=0x0, duration=3850.798s, table=0, n_packets=0, n_bytes=0, idle_age=3850, priority=2,ip,in_port=1,dl_src=2e:b0:cb:b2:b6:9a,dl_dst=ea:5b:03:b6:13:be,nw_src=10.0.0.12,nw_dst=10.0.0.9 actions=output:4
 cookie=0x0, duration=3840.796s, table=0, n_packets=0, n_bytes=0, idle_age=3840, priority=2,ip,in_port=1,dl_src=2e:b0:cb:b2:b6:9a,dl_dst=e6:f9:5c:67:99:b9,nw_src=10.0.0.12,nw_dst=10.0.0.10 actions=output:3
 cookie=0x0, duration=3830.791s, table=0, n_packets=0, n_bytes=0, idle_age=3830, priority=2,ip,in_port=1,dl_src=2e:b0:cb:b2:b6:9a,dl_dst=32:f7:65:6e:51:3a,nw_src=10.0.0.12,nw_dst=10.0.0.11 actions=output:2
 cookie=0x0, duration=3529.259s, table=0, n_packets=0, n_bytes=0, idle_age=3529, priority=2,ip,in_port=1,dl_src=d2:bd:d7:55:fe:91,dl_dst=02:4b:98:a2:72:3b,nw_src=10.0.0.4,nw_dst=10.0.0.15 actions=output:5
 cookie=0x0, duration=3476.184s, table=0, n_packets=0, n_bytes=0, idle_age=3476, priority=2,ip,in_port=1,dl_src=32:31:98:86:f1:16,dl_dst=02:4b:98:a2:72:3b,nw_src=10.0.0.13,nw_dst=10.0.0.15 actions=output:5
 cookie=0x0, duration=3466.182s, table=0, n_packets=0, n_bytes=0, idle_age=3466, priority=2,ip,in_port=1,dl_src=0a:42:a7:b7:01:17,dl_dst=02:4b:98:a2:72:3b,nw_src=10.0.0.14,nw_dst=10.0.0.15 actions=output:5
 cookie=0x0, duration=3400.048s, table=0, n_packets=0, n_bytes=0, idle_age=3400, priority=2,ip,in_port=1,dl_src=be:e8:67:8c:37:d0,dl_dst=ea:5b:03:b6:13:be,nw_src=10.0.0.16,nw_dst=10.0.0.9 actions=output:4
 cookie=0x0, duration=3390.046s, table=0, n_packets=0, n_bytes=0, idle_age=3390, priority=2,ip,in_port=1,dl_src=be:e8:67:8c:37:d0,dl_dst=e6:f9:5c:67:99:b9,nw_src=10.0.0.16,nw_dst=10.0.0.10 actions=output:3
 cookie=0x0, duration=3380.042s, table=0, n_packets=0, n_bytes=0, idle_age=3380, priority=2,ip,in_port=1,dl_src=be:e8:67:8c:37:d0,dl_dst=32:f7:65:6e:51:3a,nw_src=10.0.0.16,nw_dst=10.0.0.11 actions=output:2
 cookie=0x0, duration=3350.035s, table=0, n_packets=0, n_bytes=0, idle_age=3350, priority=2,ip,in_port=1,dl_src=be:e8:67:8c:37:d0,dl_dst=02:4b:98:a2:72:3b,nw_src=10.0.0.16,nw_dst=10.0.0.15 actions=output:5
 cookie=0x0, duration=16784.267s, table=0, n_packets=15, n_bytes=1078, idle_age=3480, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=4985.964s, table=0, n_packets=19, n_bytes=1458, idle_age=2001, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=2e:d6:1b:52:7e:44 actions=output:1
 cookie=0x0, duration=4982.912s, table=0, n_packets=10, n_bytes=532, idle_age=2001, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=2e:d6:1b:52:7e:44 actions=output:1
 cookie=0x0, duration=4946.761s, table=0, n_packets=10, n_bytes=532, idle_age=2001, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=2e:d6:1b:52:7e:44 actions=output:1
 cookie=0x0, duration=4877.547s, table=0, n_packets=7, n_bytes=350, idle_age=1996, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=ee:89:7c:55:01:40 actions=output:1
 cookie=0x0, duration=4874.496s, table=0, n_packets=7, n_bytes=350, idle_age=1986, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=ee:89:7c:55:01:40 actions=output:1
 cookie=0x0, duration=4852.219s, table=0, n_packets=7, n_bytes=350, idle_age=1966, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=ee:89:7c:55:01:40 actions=output:1
 cookie=0x0, duration=4786.060s, table=0, n_packets=7, n_bytes=350, idle_age=4224, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=2a:b5:01:ab:6a:d3 actions=output:1
 cookie=0x0, duration=4783.009s, table=0, n_packets=7, n_bytes=350, idle_age=4095, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=2a:b5:01:ab:6a:d3 actions=output:1
 cookie=0x0, duration=4746.858s, table=0, n_packets=7, n_bytes=350, idle_age=3532, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=2a:b5:01:ab:6a:d3 actions=output:1
 cookie=0x0, duration=4677.645s, table=0, n_packets=7, n_bytes=350, idle_age=4214, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=d2:bd:d7:55:fe:91 actions=output:1
 cookie=0x0, duration=4667.638s, table=0, n_packets=7, n_bytes=350, idle_age=4085, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=d2:bd:d7:55:fe:91 actions=output:1
 cookie=0x0, duration=4624.574s, table=0, n_packets=7, n_bytes=350, idle_age=3521, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=d2:bd:d7:55:fe:91 actions=output:1
 cookie=0x0, duration=4558.441s, table=0, n_packets=6, n_bytes=308, idle_age=4204, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=f6:75:ac:23:6f:f2 actions=output:1
 cookie=0x0, duration=4555.355s, table=0, n_packets=6, n_bytes=308, idle_age=4075, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=f6:75:ac:23:6f:f2 actions=output:1
 cookie=0x0, duration=4533.086s, table=0, n_packets=6, n_bytes=308, idle_age=3511, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=f6:75:ac:23:6f:f2 actions=output:1
 cookie=0x0, duration=4476.942s, table=0, n_packets=7, n_bytes=350, idle_age=4194, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=a2:9f:f9:34:94:16 actions=output:1
 cookie=0x0, duration=4473.886s, table=0, n_packets=7, n_bytes=350, idle_age=4065, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=a2:9f:f9:34:94:16 actions=output:1
 cookie=0x0, duration=4437.723s, table=0, n_packets=7, n_bytes=350, idle_age=3501, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=a2:9f:f9:34:94:16 actions=output:1
 cookie=0x0, duration=4303.905s, table=0, n_packets=6, n_bytes=308, idle_age=4181, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=9e:63:46:18:62:62 actions=output:1
 cookie=0x0, duration=4300.827s, table=0, n_packets=6, n_bytes=308, idle_age=4052, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=9e:63:46:18:62:62 actions=output:1
 cookie=0x0, duration=4264.674s, table=0, n_packets=6, n_bytes=308, idle_age=3488, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=9e:63:46:18:62:62 actions=output:1
 cookie=0x0, duration=4244.388s, table=0, n_packets=11, n_bytes=1014, idle_age=2001, priority=1,in_port=1,dl_src=2e:d6:1b:52:7e:44,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=4224.420s, table=0, n_packets=0, n_bytes=0, idle_age=4224, priority=1,in_port=1,dl_src=2a:b5:01:ab:6a:d3,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=4215.456s, table=0, n_packets=2, n_bytes=84, idle_age=4214, priority=1,in_port=1,dl_src=d2:bd:d7:55:fe:91,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=4194.465s, table=0, n_packets=0, n_bytes=0, idle_age=4194, priority=1,in_port=1,dl_src=a2:9f:f9:34:94:16,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=4181.408s, table=0, n_packets=0, n_bytes=0, idle_age=4181, priority=1,in_port=1,dl_src=9e:63:46:18:62:62,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=4178.504s, table=0, n_packets=5, n_bytes=266, idle_age=4043, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=4154.403s, table=0, n_packets=6, n_bytes=308, idle_age=3731, priority=1,in_port=1,dl_src=32:31:98:86:f1:16,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=4144.384s, table=0, n_packets=6, n_bytes=308, idle_age=3605, priority=1,in_port=1,dl_src=0a:42:a7:b7:01:17,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=4135.416s, table=0, n_packets=5, n_bytes=266, idle_age=3479, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=4115.106s, table=0, n_packets=3, n_bytes=182, idle_age=2001, priority=1,in_port=1,dl_src=2e:d6:1b:52:7e:44,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=4095.138s, table=0, n_packets=0, n_bytes=0, idle_age=4095, priority=1,in_port=1,dl_src=2a:b5:01:ab:6a:d3,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=4086.176s, table=0, n_packets=2, n_bytes=84, idle_age=4085, priority=1,in_port=1,dl_src=d2:bd:d7:55:fe:91,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=4065.185s, table=0, n_packets=0, n_bytes=0, idle_age=4065, priority=1,in_port=1,dl_src=a2:9f:f9:34:94:16,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=4052.129s, table=0, n_packets=0, n_bytes=0, idle_age=4052, priority=1,in_port=1,dl_src=9e:63:46:18:62:62,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=4044.195s, table=0, n_packets=3, n_bytes=126, idle_age=4043, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=4035.163s, table=0, n_packets=5, n_bytes=266, idle_age=3722, priority=1,in_port=1,dl_src=32:31:98:86:f1:16,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=4025.182s, table=0, n_packets=6, n_bytes=308, idle_age=3595, priority=1,in_port=1,dl_src=0a:42:a7:b7:01:17,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=4016.185s, table=0, n_packets=5, n_bytes=266, idle_age=3479, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=3995.811s, table=0, n_packets=3, n_bytes=182, idle_age=2001, priority=1,in_port=1,dl_src=2e:d6:1b:52:7e:44,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=3975.844s, table=0, n_packets=0, n_bytes=0, idle_age=3975, priority=1,in_port=1,dl_src=2a:b5:01:ab:6a:d3,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=3966.884s, table=0, n_packets=2, n_bytes=84, idle_age=3965, priority=1,in_port=1,dl_src=d2:bd:d7:55:fe:91,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=3945.884s, table=0, n_packets=0, n_bytes=0, idle_age=3945, priority=1,in_port=1,dl_src=a2:9f:f9:34:94:16,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=3932.830s, table=0, n_packets=13, n_bytes=1242, idle_age=566, priority=1,in_port=1,dl_src=9e:63:46:18:62:62,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=3925.920s, table=0, n_packets=6, n_bytes=308, idle_age=3711, priority=1,in_port=1,dl_src=32:31:98:86:f1:16,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=3924.893s, table=0, n_packets=2, n_bytes=84, idle_age=3923, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=3924.893s, table=0, n_packets=3, n_bytes=126, idle_age=3923, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=3915.934s, table=0, n_packets=6, n_bytes=308, idle_age=3585, priority=1,in_port=1,dl_src=0a:42:a7:b7:01:17,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=3845.793s, table=0, n_packets=2, n_bytes=84, idle_age=3843, priority=1,in_port=1,dl_src=2e:b0:cb:b2:b6:9a,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=3844.768s, table=0, n_packets=1, n_bytes=42, idle_age=3843, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=2e:b0:cb:b2:b6:9a actions=output:1
 cookie=0x0, duration=3835.554s, table=0, n_packets=2, n_bytes=84, idle_age=3833, priority=1,in_port=1,dl_src=2e:b0:cb:b2:b6:9a,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=3834.531s, table=0, n_packets=1, n_bytes=42, idle_age=3833, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=2e:b0:cb:b2:b6:9a actions=output:1
 cookie=0x0, duration=3825.571s, table=0, n_packets=2, n_bytes=84, idle_age=3823, priority=1,in_port=1,dl_src=2e:b0:cb:b2:b6:9a,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=3814.653s, table=0, n_packets=6, n_bytes=308, idle_age=3478, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=2e:b0:cb:b2:b6:9a actions=output:1
 cookie=0x0, duration=3733.411s, table=0, n_packets=5, n_bytes=210, idle_age=3731, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=32:31:98:86:f1:16 actions=output:1
 cookie=0x0, duration=3723.425s, table=0, n_packets=3, n_bytes=126, idle_age=3722, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=32:31:98:86:f1:16 actions=output:1
 cookie=0x0, duration=3688.492s, table=0, n_packets=7, n_bytes=350, idle_age=3468, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=32:31:98:86:f1:16 actions=output:1
 cookie=0x0, duration=3607.204s, table=0, n_packets=5, n_bytes=210, idle_age=3605, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=0a:42:a7:b7:01:17 actions=output:1
 cookie=0x0, duration=3597.219s, table=0, n_packets=5, n_bytes=210, idle_age=3595, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=0a:42:a7:b7:01:17 actions=output:1
 cookie=0x0, duration=3572.321s, table=0, n_packets=7, n_bytes=350, idle_age=3458, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=0a:42:a7:b7:01:17 actions=output:1
 cookie=0x0, duration=3552.164s, table=0, n_packets=3, n_bytes=182, idle_age=2001, priority=1,in_port=1,dl_src=2e:d6:1b:52:7e:44,dl_dst=02:4b:98:a2:72:3b actions=output:5
 cookie=0x0, duration=3532.196s, table=0, n_packets=0, n_bytes=0, idle_age=3532, priority=1,in_port=1,dl_src=2a:b5:01:ab:6a:d3,dl_dst=02:4b:98:a2:72:3b actions=output:5
 cookie=0x0, duration=3522.979s, table=0, n_packets=2, n_bytes=84, idle_age=3521, priority=1,in_port=1,dl_src=d2:bd:d7:55:fe:91,dl_dst=02:4b:98:a2:72:3b actions=output:5
 cookie=0x0, duration=3501.987s, table=0, n_packets=0, n_bytes=0, idle_age=3501, priority=1,in_port=1,dl_src=a2:9f:f9:34:94:16,dl_dst=02:4b:98:a2:72:3b actions=output:5
 cookie=0x0, duration=3488.932s, table=0, n_packets=0, n_bytes=0, idle_age=3488, priority=1,in_port=1,dl_src=9e:63:46:18:62:62,dl_dst=02:4b:98:a2:72:3b actions=output:5
 cookie=0x0, duration=3480.994s, table=0, n_packets=3, n_bytes=126, idle_age=3479, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=02:4b:98:a2:72:3b actions=output:5
 cookie=0x0, duration=3480.994s, table=0, n_packets=3, n_bytes=126, idle_age=3479, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=02:4b:98:a2:72:3b actions=output:5
 cookie=0x0, duration=3469.988s, table=0, n_packets=3, n_bytes=126, idle_age=3468, priority=1,in_port=1,dl_src=32:31:98:86:f1:16,dl_dst=02:4b:98:a2:72:3b actions=output:5
 cookie=0x0, duration=3460.003s, table=0, n_packets=2, n_bytes=84, idle_age=3458, priority=1,in_port=1,dl_src=0a:42:a7:b7:01:17,dl_dst=02:4b:98:a2:72:3b actions=output:5
 cookie=0x0, duration=3394.980s, table=0, n_packets=2, n_bytes=84, idle_age=3392, priority=1,in_port=1,dl_src=be:e8:67:8c:37:d0,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=3393.956s, table=0, n_packets=1, n_bytes=42, idle_age=3392, priority=1,in_port=4,dl_src=ea:5b:03:b6:13:be,dl_dst=be:e8:67:8c:37:d0 actions=output:1
 cookie=0x0, duration=3384.995s, table=0, n_packets=2, n_bytes=84, idle_age=3382, priority=1,in_port=1,dl_src=be:e8:67:8c:37:d0,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=3383.972s, table=0, n_packets=1, n_bytes=42, idle_age=3382, priority=1,in_port=3,dl_src=e6:f9:5c:67:99:b9,dl_dst=be:e8:67:8c:37:d0 actions=output:1
 cookie=0x0, duration=3375.012s, table=0, n_packets=2, n_bytes=84, idle_age=3372, priority=1,in_port=1,dl_src=be:e8:67:8c:37:d0,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=3344.804s, table=0, n_packets=2, n_bytes=84, idle_age=3342, priority=1,in_port=1,dl_src=be:e8:67:8c:37:d0,dl_dst=02:4b:98:a2:72:3b actions=output:5
 cookie=0x0, duration=3343.775s, table=0, n_packets=1, n_bytes=42, idle_age=3342, priority=1,in_port=5,dl_src=02:4b:98:a2:72:3b,dl_dst=be:e8:67:8c:37:d0 actions=output:1
 cookie=0x0, duration=1997.220s, table=0, n_packets=1, n_bytes=42, idle_age=1996, priority=1,in_port=1,dl_src=ee:89:7c:55:01:40,dl_dst=ea:5b:03:b6:13:be actions=output:4
 cookie=0x0, duration=1987.235s, table=0, n_packets=1, n_bytes=42, idle_age=1986, priority=1,in_port=1,dl_src=ee:89:7c:55:01:40,dl_dst=e6:f9:5c:67:99:b9 actions=output:3
 cookie=0x0, duration=1977.249s, table=0, n_packets=1, n_bytes=42, idle_age=1976, priority=1,in_port=1,dl_src=ee:89:7c:55:01:40,dl_dst=32:f7:65:6e:51:3a actions=output:2
 cookie=0x0, duration=1967.267s, table=0, n_packets=1, n_bytes=42, idle_age=1966, priority=1,in_port=1,dl_src=ee:89:7c:55:01:40,dl_dst=02:4b:98:a2:72:3b actions=output:5
 cookie=0x0, duration=16849.188s, table=0, n_packets=1278, n_bytes=94754, idle_age=112, priority=0 actions=CONTROLLER:65535
