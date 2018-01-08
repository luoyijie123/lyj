#    模拟实现FCFS（先来先服务）算法
      FCFS算法按照任务到达的顺序进行服务，先来先服务
    每个Task对象可以描述为至少包含下列属性：
    taskID //任务ID
    arrivalTime //到达时间
    serviceTime //服务时间
    startingTime //开始时间
    finishingTime //完成时间=开始时间+服务时间
    turnAroundTime //周转时间=完成时间-达到时间
    weightTurnAround //带权周转时间=周转时间/服务时间
    其他的属性根据程序需要设置
    任务(Task)的ID、开始时间和服务时间由文件读入，形如右图所示。这个任务列表文件首先由程序生成，每秒一个任务达到，服务时间由{6,2,1,3,9}这个集合中的数     据随机获取。文件列表要包含至少100个任务。
    先要求实现如下要求的FCFS
    当只有一个处理队列时的情况
    当有两个处理队列时的情况
   运行截图:
   ![Image text](https://raw.githubusercontent.com/luoyijie123/lyj/master/实验四_综合小实验/FCFS_2/run.PNG)
