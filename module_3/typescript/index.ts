
interface ISingleRepo {
    name: string;
}
interface IRepos {
    items: Array<ISingleRepo>;
}
document.querySelector("#btn").addEventListener('click', main);

async function fetchRepo(name1: string): Promise<Array<ISingleRepo>> {
    let res: Response | IRepos = await fetch('https://api.github.com/search/repositories?q='+name1);
    res = await res.json() as IRepos;
    return res.items;
}

async function main() {
    const name1: string = (document.getElementById('name')as HTMLInputElement).value;
    // step 1: fetch repo
    const res = await fetchRepo(name1);
    // step 2: lặp qua mảng các item trả về
    // step 3: call hàm createItem sau đó truyền vào name của từng item ở mỗi vòng lặp
    // step 4: call hàm container.appendChild(item mà hàm createItem trả về)
    res.forEach((item: any) => {

      document.getElementById('table').innerHTML+='<tr><td>'+item.full_name+'<td><td>'+item.url+'</td></tr>';
      console.log(item)

    });
}



