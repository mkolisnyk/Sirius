﻿using System;
using System.ServiceModel;
namespace Sirius.Win32.Svc.Controls
{
    [ServiceContract(Namespace = "http://scrollbar.controls.win32lib.server.sirius.org/")]
    public interface IScrollBarContract
    {
        [OperationContract]
        double GetLowerBound([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        double GetPosition([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        double GetUpperBound([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        void SetPosition([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "pos")]double pos);
        [OperationContract]
        double GetSmallStep([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        double GetLargeStep([param: MessageParameter(Name = "hwnd")]int hwnd);
    }
}
