using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel;

namespace Sirius.Win32.Svc.Controls
{
    [ServiceContract(Namespace = "Sirius.Win32.Svc.Controls", Name="Edit")]
    public interface IEditContract
    {
        [OperationContract]
        String GetText([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        void SetText([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "text")]String text);
        [OperationContract]
        void TypeText([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "text")]String text);
        [OperationContract]
        void SetCursorPosition([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "col")]int col, [param: MessageParameter(Name = "row")]int row);
        [OperationContract]
        void SetSelection([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "scol")]int scol, [param: MessageParameter(Name = "srow")]int srow, [param: MessageParameter(Name = "ecol")]int ecol, [param: MessageParameter(Name = "erow")]int erow);
        [OperationContract]
        String GetSelectedText([param: MessageParameter(Name = "hwnd")]int hwnd);
    }
}
