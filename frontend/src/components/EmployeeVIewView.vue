<template>

    <v-data-table
        :headers="headers"
        :items="employeeVIew"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'EmployeeVIewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            employeeVIew : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/employeeVIews'))

            temp.data._embedded.employeeVIews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.employeeVIew = temp.data._embedded.employeeVIews;
        },
        methods: {
        }
    }
</script>

